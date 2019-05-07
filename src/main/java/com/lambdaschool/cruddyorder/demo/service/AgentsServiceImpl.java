package com.lambdaschool.cruddyorder.demo.service;


import com.lambdaschool.cruddyorder.demo.model.Agents;
import com.lambdaschool.cruddyorder.demo.model.Customer;
import com.lambdaschool.cruddyorder.demo.repos.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Transactional
@Service(value= "agentService")
public class AgentsServiceImpl implements AgentService
{
    @Autowired
    private AgentRepository agentrepos;

    @Override
    public List<Agents> findAll() {
        List<Agents> list = new ArrayList<>();
        agentrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Agents findAgentById(long agentcode) throws EntityNotFoundException {
        return agentrepos.findById(agentcode)
                .orElseThrow(() -> new EntityNotFoundException(Long.toString(agentcode)));
    }

    @Override
    public Agents findAgentByName(String agentname)  throws EntityNotFoundException {
        Agents agent = agentrepos.findByAgentname(agentname);
        if (agent == null)
        {
            throw new EntityNotFoundException("Agent not found");
        }

        return agent;
    }
    @Transactional
    @Override
    public void delete(long agentcode) throws EntityNotFoundException {
        if(agentrepos.findById(agentcode).isPresent())
        {
          agentrepos.deleteById(agentcode);
        } else
        {
            throw new EntityNotFoundException(Long.toString(agentcode));
        }
    }
    @Transactional
    @Override
    public Agents save(Agents agent) {
        Agents newAgent = new Agents();
        newAgent.setAgentname(agent.getAgentname());
        newAgent.setCommission(agent.getCommission());
        newAgent.setCountry(agent.getCountry());
        newAgent.setPhone(agent.getPhone());
        newAgent.setWorkingarea(agent.getWorkingarea());

        for (Customer c : agent.getCustomers())
        {
            newAgent.getCustomers().add(new Customer(c.getCustname(), c.getCustcity(), c.getWorkingarea(), c.getGrade(), c.getOpeningamt(), c.getRecieveamt(), c.getPaymentamt(), c.getOutstandingamt(), c.getPhone(), newAgent));
        }
        return agentrepos.save(newAgent);
    }
    @Transactional
    @Override
    public Agents update(Agents agent, long agentcode) throws EntityNotFoundException {
        Agents currentAgent = agentrepos.findById(agentcode)
                .orElseThrow(()-> new EntityNotFoundException(Long.toString(agentcode)));

        if(agent.getAgentname() != null)
        {
            currentAgent.setAgentname(agent.getAgentname());
        }
        if(agent.getCountry() != null)
        {
            currentAgent.setCountry(agent.getCountry());
        }
        if (agent.getPhone() != null)
        {
            currentAgent.setPhone(agent.getPhone());
        }
        if (agent.getWorkingarea() != null)
        {
            currentAgent.setWorkingarea(agent.getWorkingarea());
        }
        if (agent.getCustomers().size() > 0)
        {
            for(Customer c: agent.getCustomers())
            {
                currentAgent.getCustomers().add(new Customer(c.getCustname(), c.getCustcity(), c.getWorkingarea(), c.getGrade(), c.getOpeningamt(), c.getRecieveamt(), c.getPaymentamt(), c.getOutstandingamt(), c.getPhone(), currentAgent));
            }
        }
        return agentrepos.save(currentAgent);
    }
}

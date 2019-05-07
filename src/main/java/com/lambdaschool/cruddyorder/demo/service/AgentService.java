package com.lambdaschool.cruddyorder.demo.service;

import com.lambdaschool.cruddyorder.demo.model.Agents;
import java.util.List;

public interface AgentService
{
    List<Agents> findAll();

    Agents findAgentById(long agentcode);
    Agents findAgentByName(String agentname);
    void delete(long agentcode);

    Agents save(Agents agent);

    Agents update(Agents agent, long agentcode);


}

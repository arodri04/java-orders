package com.lambdaschool.cruddyorder.demo.repos;

import com.lambdaschool.cruddyorder.demo.model.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agents, Long>
{
    Agents findByAgentname(String agentname);
}

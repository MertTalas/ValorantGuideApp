package com.mert.valorantguideapp.domain.repository

import com.mert.valorantguideapp.data.model.agents.AgentByUuidResponse
import com.mert.valorantguideapp.data.model.agents.AgentsResponse

interface ValorantRepository {

    suspend fun getAgents(): AgentsResponse

    suspend fun getAgentByUuid(agentUuid: String): AgentByUuidResponse
}
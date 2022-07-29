package com.mert.valorantguideapp.data.repository

import com.mert.valorantguideapp.data.ValorantAPI
import com.mert.valorantguideapp.data.model.agents.AgentByUuidResponse
import com.mert.valorantguideapp.data.model.agents.AgentsResponse
import com.mert.valorantguideapp.domain.repository.ValorantRepository
import javax.inject.Inject

class ValorantRepositoryImp @Inject constructor(
    private val valorantAPI: ValorantAPI
): ValorantRepository {

    override suspend fun getAgents(): AgentsResponse =
        valorantAPI.getAgents()

    override suspend fun getAgentByUuid(agentUuid: String): AgentByUuidResponse =
        valorantAPI.getAgentByUuid(agentUuid)
}
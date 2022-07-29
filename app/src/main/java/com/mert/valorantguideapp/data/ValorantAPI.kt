package com.mert.valorantguideapp.data

import com.mert.valorantguideapp.data.model.agents.AgentByUuidResponse
import com.mert.valorantguideapp.data.model.agents.AgentsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ValorantAPI {

    @GET("/agents/?isPlayableCharacter=true")
    suspend fun getAgents(): AgentsResponse

    @GET("/agents/{agentUuid}")
    suspend fun getAgentByUuid(@Path("agentUuid") agentUuid: String): AgentByUuidResponse
}
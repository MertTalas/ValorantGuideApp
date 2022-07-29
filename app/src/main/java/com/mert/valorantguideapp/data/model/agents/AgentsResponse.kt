package com.mert.valorantguideapp.data.model.agents


import com.google.gson.annotations.SerializedName

data class AgentsResponse(
    @SerializedName("data")
    val data: List<AgentDto>,
    @SerializedName("status")
    val status: Int
)
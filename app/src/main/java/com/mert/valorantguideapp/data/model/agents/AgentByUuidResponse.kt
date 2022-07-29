package com.mert.valorantguideapp.data.model.agents

import com.google.gson.annotations.SerializedName

data class AgentByUuidResponse(
    @SerializedName("data")
    val data: AgentDto,
    @SerializedName("status")
    val status: Int
)

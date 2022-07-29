package com.mert.valorantguideapp.domain.model

import com.mert.valorantguideapp.data.model.agents.Ability
import com.mert.valorantguideapp.data.model.agents.Role

data class AgentModel(
    val uuid: String,
    val role: Role,
    val abilities: List<Ability>,
    val description: String,
    val displayName: String,
    val displayIcon: String,
    val fullPortrait: String,
)

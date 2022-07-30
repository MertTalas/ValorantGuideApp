package com.mert.valorantguideapp.ui.agents

import androidx.lifecycle.ViewModel
import com.mert.valorantguideapp.domain.usecase.get_agents.GetAgentsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AgentsViewModel @Inject constructor(
    private val getAgentsUseCase: GetAgentsUseCase
): ViewModel() {


}
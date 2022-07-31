package com.mert.valorantguideapp.ui.agents

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mert.valorantguideapp.domain.usecase.GetAgentsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AgentsViewModel @Inject constructor(
    private val getAgentsUseCase: GetAgentsUseCase
): ViewModel() {

    fun getAgents() {
        viewModelScope.launch(Dispatchers.IO) {
            getAgentsUseCase().collect{
                Log.d("göt",it.data.toString())
            }
        }
    }
}
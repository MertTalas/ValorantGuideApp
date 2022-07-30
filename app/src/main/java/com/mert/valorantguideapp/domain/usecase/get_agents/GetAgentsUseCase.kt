package com.mert.valorantguideapp.domain.usecase.get_agents

import com.mert.valorantguideapp.data.model.agents.toAgent
import com.mert.valorantguideapp.domain.model.Agent
import com.mert.valorantguideapp.domain.repository.ValorantRepository
import com.mert.valorantguideapp.common.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetAgentsUseCase @Inject constructor(
    private val valorantRepository: ValorantRepository
) {

    operator fun invoke(): Flow<Resource<List<Agent>>> = flow {
        try {
            emit(Resource.Loading())
            emit(Resource.Success(valorantRepository.getAgents().data.map { it.toAgent()}))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage.orEmpty()))
        } catch (e: IOException) {
            emit(Resource.Error(e.localizedMessage.orEmpty()))
        }
    }
}
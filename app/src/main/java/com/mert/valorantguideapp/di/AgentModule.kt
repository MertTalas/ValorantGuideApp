package com.mert.valorantguideapp.di

import com.mert.valorantguideapp.data.ValorantAPI
import com.mert.valorantguideapp.data.repository.ValorantRepositoryImp
import com.mert.valorantguideapp.domain.repository.ValorantRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Singleton

@Module
@InstallIn(ViewModelScoped::class)
object AgentModule {

    @Provides
    @Singleton
    fun provideValorantRepository(valorantAPI: ValorantAPI): ValorantRepository {
        return ValorantRepositoryImp(valorantAPI)
    }
}
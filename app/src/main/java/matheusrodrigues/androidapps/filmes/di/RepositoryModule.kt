package matheusrodrigues.androidapps.filmes.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import matheusrodrigues.androidapps.filmes.data.api.ServiceApi
import matheusrodrigues.androidapps.filmes.data.database.FilmeDao
import matheusrodrigues.androidapps.filmes.data.repository.LocalRepository
import matheusrodrigues.androidapps.filmes.data.repository.RemoteRepository
import matheusrodrigues.androidapps.filmes.data.repository.Repository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideRemoteRepository(
        api: ServiceApi,
    ): Repository.RemoteData {
        return RemoteRepository(api)
    }

    @Singleton
    @Provides
    fun provideLocalRepository(dao: FilmeDao): Repository.LocalData {
        return LocalRepository(dao)
    }
}
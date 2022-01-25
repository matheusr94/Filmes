package matheusrodrigues.androidapps.filmes.data.repository

import matheusrodrigues.androidapps.filmes.data.api.ServiceApi
import matheusrodrigues.androidapps.filmes.data.database.FilmeDao
import matheusrodrigues.androidapps.filmes.domain.model.Filme
import javax.inject.Inject

class LocalRepository @Inject constructor(
    private val dao: FilmeDao
) : Repository.LocalData {
    override suspend fun insertAll(filmes: List<Filme>): List<Long> {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(): List<Filme>? {
        TODO("Not yet implemented")
    }
}


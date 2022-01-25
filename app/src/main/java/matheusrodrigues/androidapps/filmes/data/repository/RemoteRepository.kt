package matheusrodrigues.androidapps.filmes.data.repository

import matheusrodrigues.androidapps.filmes.data.api.ServiceApi
import matheusrodrigues.androidapps.filmes.data.model.filme.SearchReponse
import matheusrodrigues.androidapps.filmes.data.repository.Repository.*
import retrofit2.Response
import javax.inject.Inject

class RemoteRepository @Inject constructor(
    private val api: ServiceApi
) : RemoteData {
    override suspend fun getMovies(): Response<SearchReponse> {
        TODO("Not yet implemented")
    }
}
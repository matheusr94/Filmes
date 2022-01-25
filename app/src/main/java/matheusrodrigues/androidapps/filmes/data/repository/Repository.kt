package matheusrodrigues.androidapps.filmes.data.repository

import matheusrodrigues.androidapps.filmes.data.model.filme.SearchReponse
import matheusrodrigues.androidapps.filmes.domain.model.Filme
import retrofit2.Response

interface Repository {
    interface RemoteData{
        suspend fun getMovies() :Response<SearchReponse>
    }

    interface LocalData{
        suspend fun insertAll(filmes: List<Filme>): List<Long>

        suspend fun getAll():List<Filme>?
    }
}
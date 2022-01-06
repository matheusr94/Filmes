package matheusrodrigues.androidapps.filmes.data.api

import matheusrodrigues.androidapps.filmes.data.model.filme.SearchReponse
import matheusrodrigues.androidapps.filmes.util.Constants.KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApi {

    @GET("/")
    suspend fun getMovies(
        @Query("type") typeSearch: String = "movie",
        @Query("s") searchTitle: String,
        @Query("apiKey") apiKey: String = KEY,
    ): Response<SearchReponse>

}
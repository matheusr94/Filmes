package matheusrodrigues.androidapps.filmes.data.remote

import matheusrodrigues.androidapps.filmes.data.model.filme.FilmeModelResponse
import matheusrodrigues.androidapps.filmes.util.Constants.API_KEY
import matheusrodrigues.androidapps.filmes.util.Constants.KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApi {

    @GET(API_KEY + KEY)
    suspend fun filmesTitulo(
        @Query("s") s:String? = null
    ): Response<FilmeModelResponse>


    @GET(API_KEY + KEY)
    suspend fun filmesId(
        @Query("i") i: String? = null
    ): Response<FilmeModelResponse>
}
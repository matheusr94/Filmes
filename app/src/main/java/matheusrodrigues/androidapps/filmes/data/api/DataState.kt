package matheusrodrigues.androidapps.filmes.data.api

import okhttp3.ResponseBody
import retrofit2.Response


sealed class DataState<T>(
        val data: T? = null,
        val message: String? = null
){
    class Success<T>(data: T?) : DataState<T>(data)
    class Error<T>(message: String, data: T? = null) : DataState<T>(data, message)
    class Loading<T> : DataState<T>()
    class Empty<T> : DataState<T>()
}



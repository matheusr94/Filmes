package matheusrodrigues.androidapps.filmes.data.model.filme

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class FilmeModelResponse(

    @SerializedName("data")
    val data: FilmeModelData
) : Serializable

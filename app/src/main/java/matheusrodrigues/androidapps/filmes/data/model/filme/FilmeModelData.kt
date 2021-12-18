package matheusrodrigues.androidapps.filmes.data.model.filme

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class FilmeModelData(

    @SerializedName("results")
    val results:List<FilmeModel>
): Serializable

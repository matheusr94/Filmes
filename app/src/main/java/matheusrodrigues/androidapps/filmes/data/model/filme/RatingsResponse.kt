package matheusrodrigues.androidapps.filmes.data.model.filme

import com.google.gson.annotations.SerializedName

data class RatingsResponse (

    @SerializedName("Source")
    val source: String,
    @SerializedName("Value")
    val value: String
)

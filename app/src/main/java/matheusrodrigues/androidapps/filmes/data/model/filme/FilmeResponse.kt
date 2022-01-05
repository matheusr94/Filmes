package matheusrodrigues.androidapps.filmes.data.model.filme

import com.google.gson.annotations.SerializedName

data class FilmeResponse(

    @SerializedName("Title")
    val title: String,
    @SerializedName("Year")
    val year: String,
    @SerializedName("Runtime")
    val runtime: String,
    @SerializedName("imdbID")
    val imdbID: String,
    @SerializedName("Genre")
    val genre: String,
    @SerializedName("Director")
    val director: String,
    @SerializedName("Language")
    val language: String,
    @SerializedName("Country")
    val country: String,
    @SerializedName("Poster")
    val poster: String,
    @SerializedName("Type")
    val type: String,
    @SerializedName("Rated")
    val rated: String,
    @SerializedName("Ratings")
    val ratings: List<RatingsResponse>
)

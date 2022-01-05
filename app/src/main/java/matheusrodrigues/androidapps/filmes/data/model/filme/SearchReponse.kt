package matheusrodrigues.androidapps.filmes.data.model.filme

import com.google.gson.annotations.SerializedName

data class SearchReponse(

    @SerializedName("Search")
    val resultSearch: List<FilmeResponse>?
)

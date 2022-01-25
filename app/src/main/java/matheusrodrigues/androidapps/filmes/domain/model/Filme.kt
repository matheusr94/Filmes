package matheusrodrigues.androidapps.filmes.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import matheusrodrigues.androidapps.filmes.data.model.filme.RatingsResponse

@Parcelize
data class Filme(
    val id: String,
    val title: String,
    val year: String,
    val runtime: String,
    val genre: String,
    val poster: String,
    val type: String,
) : Parcelable

package matheusrodrigues.androidapps.filmes.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import matheusrodrigues.androidapps.filmes.data.model.filme.RatingsResponse

@Entity(tableName = "filme")
data class FilmeEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "_id")
    val _id: Long,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "year")
    val year: String,

    @ColumnInfo(name = "runtime")
    val runtime: String,

    @ColumnInfo(name = "imdbID")
    val imdbID: String,

    @ColumnInfo(name = "genre")
    val genre: String,

    @ColumnInfo(name = "director")
    val director: String,

    @ColumnInfo(name = "language")
    val language: String,

    @ColumnInfo(name = "country")
    val country: String,

    @ColumnInfo(name = "poster")
    val poster: String,

    @ColumnInfo(name = "type")
    val type: String,

    @ColumnInfo(name = "rated")
    val rated: String,

    /*@ColumnInfo(name = "ratings")
    val ratings: List<RatingsResponse>*/


    )

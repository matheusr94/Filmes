package matheusrodrigues.androidapps.filmes.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import matheusrodrigues.androidapps.filmes.data.database.entity.FilmeEntity

@Database(entities = [FilmeEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun filmeDao(): FilmeDao

    companion object{
        const val DATABASE_NAME: String = "filmes.db"
    }
}
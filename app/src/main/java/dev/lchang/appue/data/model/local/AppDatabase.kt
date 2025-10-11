package dev.lchang.appue.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import dev.lchang.appue.data.model.local.FavoriteCountryEntity

@Database(entities = [FavoriteCountryEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract val favoriteCountryDao: FavoriteCountryDao
    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "country_app_db"
                ).build().also {INSTANCE = it}
            }

        }
    }
}
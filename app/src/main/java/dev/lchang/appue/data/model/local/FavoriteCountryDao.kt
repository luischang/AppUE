package dev.lchang.appue.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import dev.lchang.appue.data.model.local.FavoriteCountryEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteCountryDao {
    //Insert FavoriteCountryEntity
    @Insert
    suspend fun insertFavoriteCountry(favoriteCountry: FavoriteCountryEntity)
    //Delete FavoriteCountryEntity
    @Delete
    suspend fun deleteFavoriteCountry(favoriteCountry: FavoriteCountryEntity)
    //Get All FavoriteCountryEntity
    @Query("SELECT * FROM favorite_countries")
    fun getAll(): Flow<List<FavoriteCountryEntity>>



}
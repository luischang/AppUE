package dev.lchang.appue.data.model.repository

import dev.lchang.appue.data.local.FavoriteCountryDao
import dev.lchang.appue.data.model.local.FavoriteCountryEntity
import kotlinx.coroutines.flow.Flow

class FavoriteRepository(private val dao: FavoriteCountryDao){
    suspend fun insert(country: FavoriteCountryEntity)
        = dao.insertFavoriteCountry(country)

    suspend fun delete(country: FavoriteCountryEntity)
        = dao.deleteFavoriteCountry(country)



    fun getAll(): Flow<List<FavoriteCountryEntity>>
        = dao.getAll()





}
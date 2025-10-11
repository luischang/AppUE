package dev.lchang.appue.data.model.local

import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "favorite_countries")
data class FavoriteCountryEntity (
    @PrimaryKey(autoGenerate = true) val id: Int=0,
    val name:String,
    var ranking: Int,
    val imageUrl: String
)



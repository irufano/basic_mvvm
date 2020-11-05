package com.irufano.basicmvvm.model

import android.os.Parcelable
import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class PokemonCard(
    var name: String?,
    @SerializedName("imageUrl") var image: String?,
    var rarity: String?,
    var series: String?
) : Parcelable {
    data class PokemonCardResponse(
        var cards: MutableList<PokemonCard>
    )
}
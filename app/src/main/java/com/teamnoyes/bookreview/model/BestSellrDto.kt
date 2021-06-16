package com.teamnoyes.bookreview.model

import com.google.gson.annotations.SerializedName

data class BestSellrDto(
    @SerializedName("title") val title: String,
    @SerializedName("item") val books: List<Book>
)
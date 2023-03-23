package com.codepath.articlesearch

import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable



data class Article(
    @SerializedName("overview")
    var description: String?,

    @SerializedName("release_date")
    var releaseDate: String? =  null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("poster_path")
    var url: String? = null,

    @SerializedName("vote_average")
    var voteAVG: String? = null,

    @SerializedName("vote_count")
    var voteCNT: String? = null,

): java.io.Serializable




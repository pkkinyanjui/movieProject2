package com.codepath.articlesearch

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//@Keep
//@Serializable
//data class SearchNewsResponse(
//    @SerialName("response")
//    val response: BaseResponse?
//)

@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("results")
    val response: List<Article>?
)

@Keep
@Serializable
data class Article(
    @SerialName("overview")
    val abstract: String?,

    @SerialName("release_date")
    val byline: Byline?,

    @SerialName("title")
    val headline: HeadLine?,

    @SerialName("poster_path")
    val multimedia: List<MultiMedia>?,

) : java.io.Serializable

@Keep
@Serializable
data class HeadLine(
    @SerialName("title")
    val main: String
) : java.io.Serializable


@Keep
@Serializable
data class Byline(
    @SerialName("release_date")
    val original: String? = null
) : java.io.Serializable

@Keep
@Serializable
data class MultiMedia(
    @SerialName("poster_path")
    val url: String?
) : java.io.Serializable




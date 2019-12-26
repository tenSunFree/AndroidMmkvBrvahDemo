package com.home.androidmmkvbrvahdemo.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MainPojo(
    @SerializedName("array")
    val results: MutableList<Result>
) : Parcelable {
    @Parcelize
    data class Result(
        @SerializedName("content")
        val content: String,
        @SerializedName("time")
        val time: String
    ) : Parcelable
}
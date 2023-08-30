package com.example.testapplemarket

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Items(var itemImage:Int, var itemSubject:String, var itemContent:String, var itemPlace:String,
                 var itemPrice:Int, var address:String, var commentNumber:Int, var likeNumber:Int) :
    Parcelable {
}
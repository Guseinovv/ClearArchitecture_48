package com.example.cleararchitecture_48.domain.model

class Note (
    val id: Int = DEFAULT_ID,
    val title: String,
    val description: String,
    val createdAt: Long
    ){
    companion object{
        const val DEFAULT_ID = 0
    }
}

package com.example.cleararchitecture_48.data.local

import androidx.room.*
import com.example.cleararchitecture_48.data.model.NoteEntity


@Dao
interface NoteDao {

    @Insert
    suspend fun createNote(noteEntity: NoteEntity)

    @Update
    suspend fun editNote(noteEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes")
    suspend fun getNotes(): List<NoteEntity>
}
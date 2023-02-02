package com.example.cleararchitecture_48.domain.repository

import com.example.cleararchitecture_48.domain.model.Note
import com.example.cleararchitecture_48.domain.utils.Resources
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun createNote(note: Note): Flow<Resources<Unit>>

    fun editNote(note: Note): Flow<Resources<Unit>>

    fun deleteNote(note: Note): Flow<Resources<Unit>>

    fun getNotes(): Flow<Resources<List<Note>>>
}

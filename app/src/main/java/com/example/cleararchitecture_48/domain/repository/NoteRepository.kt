package com.example.cleararchitecture_48.domain.repository

import com.example.cleararchitecture_48.domain.model.Note

interface NoteRepository {

    fun createNote(note: Note)
    fun editNote(note: Note)
    fun deleteNote(note: Note)
    fun getNotes(): List<Note>
}

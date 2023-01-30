package com.example.cleararchitecture_48.data.repository

import com.example.cleararchitecture_48.data.local.NoteDao
import com.example.cleararchitecture_48.data.mappers.toNote
import com.example.cleararchitecture_48.data.mappers.toNoteEntity
import com.example.cleararchitecture_48.domain.model.Note
import com.example.cleararchitecture_48.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val noteDao: NoteDao,
) : NoteRepository {

    override fun createNote(note: Note) {
        noteDao.createNote(note.toNoteEntity())
    }

    override fun editNote(note: Note) {
        noteDao.editNote(note.toNoteEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toNoteEntity())
    }

    override fun getNotes(): List<Note> {
        return noteDao.getNotes().map {
            it.toNote()
        }
    }
}
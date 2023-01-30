package com.example.cleararchitecture_48.domain.usecases

import com.example.cleararchitecture_48.domain.model.Note
import com.example.cleararchitecture_48.domain.repository.NoteRepository

class CreateNoteUseCase(
    private val noteRepository: NoteRepository,
) {
    fun createNote(note: Note) = noteRepository.createNote(note)
}

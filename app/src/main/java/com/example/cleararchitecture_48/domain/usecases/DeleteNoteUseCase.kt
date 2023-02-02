package com.example.cleararchitecture_48.domain.usecases

import com.example.cleararchitecture_48.domain.model.Note
import com.example.cleararchitecture_48.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository,
) {
    fun deleteNote(note: Note) = noteRepository.deleteNote(note)
}

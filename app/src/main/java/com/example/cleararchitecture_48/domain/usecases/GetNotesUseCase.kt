package com.example.cleararchitecture_48.domain.usecases

import com.example.cleararchitecture_48.domain.repository.NoteRepository

class GetNotesUseCase(
    private val noteRepository: NoteRepository,
) {

    fun getNotes() = noteRepository.getNotes()
}


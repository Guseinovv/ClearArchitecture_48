package com.example.cleararchitecture_48.domain.usecases

import com.example.cleararchitecture_48.domain.repository.NoteRepository
import javax.inject.Inject

class GetNotesUseCase @Inject constructor(
    private val noteRepository: NoteRepository,
) {

    fun getNotes() = noteRepository.getNotes()
}


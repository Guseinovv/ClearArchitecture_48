package com.example.cleararchitecture_48.data.mappers

import com.example.cleararchitecture_48.data.model.NoteEntity
import com.example.cleararchitecture_48.domain.model.Note

fun NoteEntity.toNote() = Note(
    id,
    title,
    description,
    createdAt
)

fun Note.toNoteEntity() = NoteEntity(
    id,
    title,
    description,
    createdAt
)

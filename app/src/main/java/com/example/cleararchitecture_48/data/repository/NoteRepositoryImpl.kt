package com.example.cleararchitecture_48.data.repository

import com.example.cleararchitecture_48.data.local.NoteDao
import com.example.cleararchitecture_48.data.mappers.toNote
import com.example.cleararchitecture_48.data.mappers.toNoteEntity
import com.example.cleararchitecture_48.domain.model.Note
import com.example.cleararchitecture_48.domain.repository.NoteRepository
import com.example.cleararchitecture_48.domain.utils.Resources
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao,
) : NoteRepository {

    override fun createNote(note: Note): Flow<Resources<Unit>> = flow {
        emit(Resources.Loading())
        delay(1555)
       try{
           val data = noteDao.createNote(note.toNoteEntity())
           emit(Resources.Success(data))
       }catch (ioException: IOException){
           emit(Resources.Error(ioException.localizedMessage?:"Unknown error"))
       }
    }.flowOn(Dispatchers.IO)

    override fun editNote(note: Note): Flow<Resources<Unit>> = flow {
        emit(Resources.Loading())
        delay(1555)
        try{
            val data = noteDao.editNote(note.toNoteEntity())
            emit(Resources.Success(data))
        }catch (ioException: IOException){
            emit(Resources.Error(ioException.localizedMessage?:"Unknown error"))
        }
    }.flowOn(Dispatchers.IO)

    override fun deleteNote(note: Note): Flow<Resources<Unit>> = flow {
        emit(Resources.Loading())
        delay(1555)
        try{
            val data = noteDao.deleteNote(note.toNoteEntity())
            emit(Resources.Success(data))
        }catch (ioException: IOException){
            emit(Resources.Error(ioException.localizedMessage?:"Unknown error"))
        }
    }.flowOn(Dispatchers.IO)

    override fun getNotes(): Flow<Resources<List<Note>>> = flow {
        emit(Resources.Loading())
        delay(1555)
        try{
            val data = noteDao.getNotes().map {it.toNote()}
            emit(Resources.Success(data))
        }catch (ioException: IOException){
            emit(Resources.Error(ioException.localizedMessage?:"Unknown error"))
        }
    }.flowOn(Dispatchers.IO)

}
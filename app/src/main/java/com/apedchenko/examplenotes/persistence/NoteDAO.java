package com.apedchenko.examplenotes.persistence;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.apedchenko.examplenotes.models.Note;

import java.util.List;

@Dao
public interface NoteDAO {

    @Insert
    long[] insertNotes(Note... notes);

    @Query("SELECT * FROM notes")
    LiveData<List<Note>> getNotes();

//    @Query("SELECT * FROM notes WHERE title LIKE :title")
//    List<Note> getNotesWithCustomQuery(String title);

    @Delete
    int delete(Note... notes); // how many row was delete

    @Update
    int update(Note... notes); // how many row was update
}

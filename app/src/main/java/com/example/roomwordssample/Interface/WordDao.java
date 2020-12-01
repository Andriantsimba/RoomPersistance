package com.example.roomwordssample.Interface;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.roomwordssample.Entity.Word;

import java.util.List;

@Dao
public interface WordDao {
    @Insert
    void insert(Word word);


    @Query("Delete from word_table")
    void deleteAll();

    @Query("Select * from word_table order by word ASC ")
    LiveData<List<Word>> getAllWords();
}

package com.example.testingversion20;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

@Dao
public interface QandaDao {

    @Insert
    public void addQuestion(Qanda qanda);

    @Query("select * from qanda where id = :id")
    public Qanda getQandabyId(int id);


    @Delete
    public void deleteQanda(Qanda qanda);

    @Update
    public void updateQanda(Qanda qanda);

}

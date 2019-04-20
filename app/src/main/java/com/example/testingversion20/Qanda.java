package com.example.testingversion20;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "qanda")
public class Qanda {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "agile_question")
    private String question;

    @ColumnInfo(name = "agile_answer")
    private String answer;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

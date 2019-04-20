package com.example.testingversion20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReadQandaActivity extends AppCompatActivity {

    private TextView tvShowQanda;

    int currentQandaId = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_qanda);

        tvShowQanda = findViewById(R.id.tvShowQanda);

        Qanda qandas = AccessDbActivity.myAppDatabase.qandaDao().getQandabyId(currentQandaId);

        String info = " ";



        int id = qandas.getId();
        String question = qandas.getQuestion();
        String answer = qandas.getAnswer();

        info = info+"\n\n" + "Id: "+id+"\n Question: "+question+"\n"+"Answer: "+answer;


        tvShowQanda.setText(info);
    }

}

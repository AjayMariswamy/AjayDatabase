package com.example.testingversion20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddQandaActivity extends AppCompatActivity {

    private EditText etAddId, etAddQuestion, etAddAnswer;
    private Button btSaveAddQanda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_qanda);

        etAddId = findViewById(R.id.etAddId);
        etAddQuestion = findViewById(R.id.etAddQuestion);
        etAddAnswer = findViewById(R.id.etAddAnswer);
        btSaveAddQanda = findViewById(R.id.btSaveAddQanda);

        btSaveAddQanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(etAddId.getText().toString());
                String question = etAddQuestion.getText().toString();
                String answer = etAddAnswer.getText().toString();

                Qanda qanda = new Qanda();
                qanda.setId(id);
                qanda.setQuestion(question);
                qanda.setAnswer(answer);

                AccessDbActivity.myAppDatabase.qandaDao().addQuestion(qanda);

                Toast.makeText(getBaseContext(), "Qanda added",Toast.LENGTH_SHORT).show();

                etAddId.setText("");
                etAddQuestion.setText("");
                etAddAnswer.setText("");
            }
        });
    }


}

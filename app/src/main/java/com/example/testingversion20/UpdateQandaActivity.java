package com.example.testingversion20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateQandaActivity extends AppCompatActivity {

    EditText etUpdateId, etUpdateQuestion, etUpdateAnswer;

    Button btUpdateQanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_qanda);

        etUpdateId = findViewById(R.id.etUpdateId);
        etUpdateQuestion = findViewById(R.id.etUpdateQuestion);
        etUpdateAnswer = findViewById(R.id.etUpdateAnswer);

        btUpdateQanda = findViewById(R.id.btUpdateQanda);

        btUpdateQanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(etUpdateId.getText().toString());
                String question = etUpdateQuestion.getText().toString();
                String answer = etUpdateAnswer.getText().toString();

                Qanda qanda = new Qanda();
                qanda.setId(id);
                qanda.setQuestion(question);
                qanda.setAnswer(answer);

                AccessDbActivity.myAppDatabase.qandaDao().updateQanda(qanda);

                Toast.makeText(getBaseContext(), "Qanda updated", Toast.LENGTH_SHORT).show();

                etUpdateId.setText("");
                etUpdateAnswer.setText("");
                etUpdateQuestion.setText("");
            }
        });
    }
}

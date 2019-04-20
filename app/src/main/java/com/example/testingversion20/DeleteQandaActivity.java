package com.example.testingversion20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteQandaActivity extends AppCompatActivity {

    EditText etDeleteQandaById;
    Button  btDeleteQandaById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_qanda);

        etDeleteQandaById  = findViewById(R.id.etDeleteQandaById);
        btDeleteQandaById = findViewById(R.id.btDeleteQandaById);


        btDeleteQandaById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(etDeleteQandaById.getText().toString());
                Qanda qanda = new Qanda();
                qanda.setId(id);
                AccessDbActivity.myAppDatabase.qandaDao().deleteQanda(qanda);

                Toast.makeText(getBaseContext(),"Qanda successfully removed", Toast.LENGTH_SHORT).show();
                etDeleteQandaById.setText("");
            }
        });

    }

}

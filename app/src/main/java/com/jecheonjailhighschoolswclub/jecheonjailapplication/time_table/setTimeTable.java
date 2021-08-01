package com.jecheonjailhighschoolswclub.jecheonjailapplication.time_table;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SetTimeTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_time_table);

        EditText txtInput;
        ArrayList<String> txtStrInput = new ArrayList<>();

        for(int i = 1; i<=35; i++) {
            int editTextID = getResources().getIdentifier("editText_"+i, "id", getPackageName());
            txtInput = (EditText) findViewById(editTextID);
            txtStrInput.add(txtInput.getText().toString());
        }

        Button viewTT = findViewById(R.id.button_viewTT);

        viewTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TimeTable.class);

                for(int i = 0; i<35; i++){
                    intent.putExtra("Sending"+i, txtStrInput.get(i));
                }

                startActivity(intent);
            }
        });
    }
}
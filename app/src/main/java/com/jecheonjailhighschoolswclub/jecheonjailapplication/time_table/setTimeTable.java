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

        EditText txtInput1 = (EditText) findViewById(R.id.editText_1);
        EditText txtInput2 = (EditText) findViewById(R.id.editText_2);
        EditText txtInput3 = (EditText) findViewById(R.id.editText_3);
        EditText txtInput4 = (EditText) findViewById(R.id.editText_4);
        EditText txtInput5 = (EditText) findViewById(R.id.editText_5);
        EditText txtInput6 = (EditText) findViewById(R.id.editText_6);
        EditText txtInput7 = (EditText) findViewById(R.id.editText_7);
        EditText txtInput8 = (EditText) findViewById(R.id.editText_8);
        EditText txtInput9 = (EditText) findViewById(R.id.editText_9);
        EditText txtInput10 = (EditText) findViewById(R.id.editText_10);
        EditText txtInput11 = (EditText) findViewById(R.id.editText_11);
        EditText txtInput12 = (EditText) findViewById(R.id.editText_12);
        EditText txtInput13 = (EditText) findViewById(R.id.editText_13);
        EditText txtInput14 = (EditText) findViewById(R.id.editText_14);
        EditText txtInput15 = (EditText) findViewById(R.id.editText_15);
        EditText txtInput16 = (EditText) findViewById(R.id.editText_16);
        EditText txtInput17 = (EditText) findViewById(R.id.editText_17);
        EditText txtInput18 = (EditText) findViewById(R.id.editText_18);
        EditText txtInput19 = (EditText) findViewById(R.id.editText_19);
        EditText txtInput20 = (EditText) findViewById(R.id.editText_20);
        EditText txtInput21 = (EditText) findViewById(R.id.editText_21);
        EditText txtInput22 = (EditText) findViewById(R.id.editText_22);
        EditText txtInput23 = (EditText) findViewById(R.id.editText_23);
        EditText txtInput24 = (EditText) findViewById(R.id.editText_24);
        EditText txtInput25 = (EditText) findViewById(R.id.editText_25);
        EditText txtInput26 = (EditText) findViewById(R.id.editText_26);
        EditText txtInput27 = (EditText) findViewById(R.id.editText_27);
        EditText txtInput28 = (EditText) findViewById(R.id.editText_28);
        EditText txtInput29 = (EditText) findViewById(R.id.editText_29);
        EditText txtInput30 = (EditText) findViewById(R.id.editText_30);
        EditText txtInput31 = (EditText) findViewById(R.id.editText_31);
        EditText txtInput32 = (EditText) findViewById(R.id.editText_32);
        EditText txtInput33 = (EditText) findViewById(R.id.editText_33);
        EditText txtInput34 = (EditText) findViewById(R.id.editText_34);
        EditText txtInput35 = (EditText) findViewById(R.id.editText_35);

        Button viewTT = findViewById(R.id.button_viewTT);

        viewTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TimeTable.class);

                intent.putExtra("Sending1", txtInput1.getText().toString());
                intent.putExtra("Sending2", txtInput2.getText().toString());
                intent.putExtra("Sending3", txtInput3.getText().toString());
                intent.putExtra("Sending4", txtInput4.getText().toString());
                intent.putExtra("Sending5", txtInput5.getText().toString());
                intent.putExtra("Sending6", txtInput6.getText().toString());
                intent.putExtra("Sending7", txtInput7.getText().toString());
                intent.putExtra("Sending8", txtInput8.getText().toString());
                intent.putExtra("Sending9", txtInput9.getText().toString());
                intent.putExtra("Sending10", txtInput10.getText().toString());
                intent.putExtra("Sending11", txtInput11.getText().toString());
                intent.putExtra("Sending12", txtInput12.getText().toString());
                intent.putExtra("Sending13", txtInput13.getText().toString());
                intent.putExtra("Sending14", txtInput14.getText().toString());
                intent.putExtra("Sending15", txtInput15.getText().toString());
                intent.putExtra("Sending16", txtInput16.getText().toString());
                intent.putExtra("Sending17", txtInput17.getText().toString());
                intent.putExtra("Sending18", txtInput18.getText().toString());
                intent.putExtra("Sending19", txtInput19.getText().toString());
                intent.putExtra("Sending20", txtInput20.getText().toString());
                intent.putExtra("Sending21", txtInput21.getText().toString());
                intent.putExtra("Sending22", txtInput22.getText().toString());
                intent.putExtra("Sending23", txtInput23.getText().toString());
                intent.putExtra("Sending24", txtInput24.getText().toString());
                intent.putExtra("Sending25", txtInput25.getText().toString());
                intent.putExtra("Sending26", txtInput26.getText().toString());
                intent.putExtra("Sending27", txtInput27.getText().toString());
                intent.putExtra("Sending28", txtInput28.getText().toString());
                intent.putExtra("Sending29", txtInput29.getText().toString());
                intent.putExtra("Sending30", txtInput30.getText().toString());
                intent.putExtra("Sending31", txtInput31.getText().toString());
                intent.putExtra("Sending32", txtInput32.getText().toString());
                intent.putExtra("Sending33", txtInput33.getText().toString());
                intent.putExtra("Sending34", txtInput34.getText().toString());
                intent.putExtra("Sending35", txtInput35.getText().toString());

                startActivity(intent);
            }
        });
    }
}
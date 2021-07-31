// 박지연  시간표
// 기존에 for문 + arraylist로 작성하던 코드의 오류가 도저히 고쳐지지 않아 임시방편으로 나열

package com.jecheonjailhighschoolswclub.jecheonjailapplication.time_table;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SetTimeTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeTable);

        //설정 화면에서 데이터 받아오기
        Intent intent = getIntent();


        String txtStrInput1 = intent.getStringExtra("Sending1");
        String txtStrInput2 = intent.getStringExtra("Sending2");
        String txtStrInput3 = intent.getStringExtra("Sending3");
        String txtStrInput4 = intent.getStringExtra("Sending4");
        String txtStrInput5 = intent.getStringExtra("Sending5");
        String txtStrInput6 = intent.getStringExtra("Sending6");
        String txtStrInput7 = intent.getStringExtra("Sending7");
        String txtStrInput8 = intent.getStringExtra("Sending8");
        String txtStrInput9 = intent.getStringExtra("Sending9");
        String txtStrInput10 = intent.getStringExtra("Sending10");
        String txtStrInput11 = intent.getStringExtra("Sending11");
        String txtStrInput12 = intent.getStringExtra("Sending12");
        String txtStrInput13 = intent.getStringExtra("Sending13");
        String txtStrInput14 = intent.getStringExtra("Sending14");
        String txtStrInput15 = intent.getStringExtra("Sending15");
        String txtStrInput16 = intent.getStringExtra("Sending16");
        String txtStrInput17 = intent.getStringExtra("Sending17");
        String txtStrInput18 = intent.getStringExtra("Sending18");
        String txtStrInput19 = intent.getStringExtra("Sending19");
        String txtStrInput20 = intent.getStringExtra("Sending20");
        String txtStrInput21 = intent.getStringExtra("Sending21");
        String txtStrInput22 = intent.getStringExtra("Sending22");
        String txtStrInput23 = intent.getStringExtra("Sending23");
        String txtStrInput24 = intent.getStringExtra("Sending24");
        String txtStrInput25 = intent.getStringExtra("Sending25");
        String txtStrInput26 = intent.getStringExtra("Sending26");
        String txtStrInput27 = intent.getStringExtra("Sending27");
        String txtStrInput28 = intent.getStringExtra("Sending28");
        String txtStrInput29 = intent.getStringExtra("Sending29");
        String txtStrInput30 = intent.getStringExtra("Sending30");
        String txtStrInput31 = intent.getStringExtra("Sending31");
        String txtStrInput32 = intent.getStringExtra("Sending32");
        String txtStrInput33 = intent.getStringExtra("Sending33");
        String txtStrInput34 = intent.getStringExtra("Sending34");
        String txtStrInput35 = intent.getStringExtra("Sending35");

        TextView txt1 = findViewById(R.id.textView_1);
        TextView txt2 = findViewById(R.id.textView_2);
        TextView txt3 = findViewById(R.id.textView_3);
        TextView txt4 = findViewById(R.id.textView_4);
        TextView txt5 = findViewById(R.id.textView_5);
        TextView txt6 = findViewById(R.id.textView_6);
        TextView txt7 = findViewById(R.id.textView_7);
        TextView txt8 = findViewById(R.id.textView_8);
        TextView txt9 = findViewById(R.id.textView_9);
        TextView txt10 = findViewById(R.id.textView_10);
        TextView txt11 = findViewById(R.id.textView_11);
        TextView txt12 = findViewById(R.id.textView_12);
        TextView txt13 = findViewById(R.id.textView_13);
        TextView txt14 = findViewById(R.id.textView_14);
        TextView txt15 = findViewById(R.id.textView_15);
        TextView txt16 = findViewById(R.id.textView_16);
        TextView txt17 = findViewById(R.id.textView_17);
        TextView txt18 = findViewById(R.id.textView_18);
        TextView txt19 = findViewById(R.id.textView_19);
        TextView txt20 = findViewById(R.id.textView_20);
        TextView txt21 = findViewById(R.id.textView_21);
        TextView txt22 = findViewById(R.id.textView_22);
        TextView txt23 = findViewById(R.id.textView_23);
        TextView txt24 = findViewById(R.id.textView_24);
        TextView txt25 = findViewById(R.id.textView_25);
        TextView txt26 = findViewById(R.id.textView_26);
        TextView txt27 = findViewById(R.id.textView_27);
        TextView txt28 = findViewById(R.id.textView_28);
        TextView txt29 = findViewById(R.id.textView_29);
        TextView txt30 = findViewById(R.id.textView_30);
        TextView txt31 = findViewById(R.id.textView_31);
        TextView txt32 = findViewById(R.id.textView_32);
        TextView txt33 = findViewById(R.id.textView_33);
        TextView txt34 = findViewById(R.id.textView_34);
        TextView txt35 = findViewById(R.id.textView_35);

        txt1.setText(txtStrInput1);
        txt2.setText(txtStrInput2);
        txt3.setText(txtStrInput3);
        txt4.setText(txtStrInput4);
        txt5.setText(txtStrInput5);
        txt6.setText(txtStrInput6);
        txt7.setText(txtStrInput7);
        txt8.setText(txtStrInput8);
        txt9.setText(txtStrInput9);
        txt10.setText(txtStrInput10);
        txt11.setText(txtStrInput11);
        txt12.setText(txtStrInput12);
        txt13.setText(txtStrInput13);
        txt14.setText(txtStrInput14);
        txt15.setText(txtStrInput15);
        txt16.setText(txtStrInput16);
        txt17.setText(txtStrInput17);
        txt18.setText(txtStrInput18);
        txt19.setText(txtStrInput19);
        txt20.setText(txtStrInput20);
        txt21.setText(txtStrInput21);
        txt22.setText(txtStrInput22);
        txt23.setText(txtStrInput23);
        txt24.setText(txtStrInput24);
        txt25.setText(txtStrInput25);
        txt26.setText(txtStrInput26);
        txt27.setText(txtStrInput27);
        txt28.setText(txtStrInput28);
        txt29.setText(txtStrInput29);
        txt30.setText(txtStrInput30);
        txt31.setText(txtStrInput31);
        txt32.setText(txtStrInput32);
        txt33.setText(txtStrInput33);
        txt34.setText(txtStrInput34);
        txt35.setText(txtStrInput35);

        //설정 화면과 상호작용하는 버튼
        Button setTT = findViewById(R.id.button_setTT);
        setTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SetTimeTable.class);
                startActivity(intent);
            }
        });

    }
}

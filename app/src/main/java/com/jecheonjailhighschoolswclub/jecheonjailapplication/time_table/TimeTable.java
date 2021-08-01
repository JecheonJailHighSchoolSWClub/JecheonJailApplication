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

        ArrayList<String> txtSave = new ArrayList<>();

        for (int i = 0; i<35; i++){
            String txtStrInput = intent.getStringExtra("sending"+i);
            int textViewID = getResources().getIdentifier("textView_"+i+1, "id", getPackageName());
            TextView txt = findViewById(textViewID);

            if(txtStrInput.isEmpty()){
                txt.setText(txtSave.get(i));
            }
            else{
                txtSave.add(txtStrInput);
                txt.setText(txtStrInput);
            }

        }
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

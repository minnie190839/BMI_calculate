package com.example.win8.bmi_calculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t = (TextView) findViewById(R.id.textView);
        t1 =(TextView) findViewById(R.id.textView2);

        Intent Page = getIntent();
        double BMI = Page.getDoubleExtra("BMI",0);
        String TextBmi = Page.getStringExtra("BMItext");



        t.setText("ค่าBMIที่ได้ คือ "+String.format("%.2f",BMI));
        t1.setText(TextBmi);

    }
}

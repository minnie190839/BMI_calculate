package com.example.win8.bmi_calculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText height,weight;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText height =(EditText)findViewById(R.id.edit_Text_Height);
        final EditText weight =(EditText)findViewById(R.id.edit_Text_weight);
        Button calculate =(Button)findViewById(R.id.button);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double height1 = Double.valueOf(height.getText().toString());
                double weight1 = Double.valueOf(weight.getText().toString());
                double bmi = weight1 / ((height1 / 100) * (height1 / 100));

                String bmiText=" ";
                if (bmi < 18.5){
                    bmiText = "อยู่ในเกณฑ์ : น้ำหนักน้อยกว่าปกติ";
                }else if(bmi < 25){
                    bmiText = "อยู่ในเกณฑ์ :น้ำหนักปกติ";
                }else if (bmi < 30) {
                    bmiText = "อยู่ในเกณฑ์ :น้ำหนักมากกว่าปกติ (ท้วม)";
                }else{
                    bmiText = "อยู่ในเกณฑ์ :น้ำหนักมากกว่าปกติมาก (อ้วน)";
                }
                Intent NewPage = new Intent(MainActivity.this,Main2Activity.class);
                NewPage.putExtra("BMI",bmi);
                NewPage.putExtra("BMItext",bmiText);
                startActivity(NewPage);
            }


        });
    }
}

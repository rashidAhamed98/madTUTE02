package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.intentsproj.FirstActivity.EXTRA_NUMBER1;
import static com.example.intentsproj.FirstActivity.EXTRA_NUMBER2;

public class SecondActivity extends AppCompatActivity {

    private Button addition, subtraction, multiplication, division;
    private TextView result;
    private EditText eText1, eText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String val1 = intent.getStringExtra(EXTRA_NUMBER1);
        String val2 = intent.getStringExtra(EXTRA_NUMBER2);

        result = (TextView) findViewById(R.id.textView6);

        eText1 = (EditText) findViewById(R.id.editText1);
        eText2 = (EditText) findViewById(R.id.editText2);
        addition = (Button) findViewById(R.id.button2);
        subtraction = (Button) findViewById(R.id.button3);
        multiplication =(Button) findViewById(R.id.button4);
        division= (Button) findViewById(R.id.button5);


        eText1.setText(val1);
        eText2.setText(val2);



        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int  num1 = Integer.parseInt(eText1.getText().toString());
                int num2 = Integer.parseInt(eText2.getText().toString());
                int sum = num1 + num2;
                result.setText(Integer.toString(num1)+"+"+Integer.toString(num2)+" = "+Integer.toString(sum));
            }
        });


        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(eText1.getText().toString());
                int num2= Integer.parseInt(eText2.getText().toString());
                int difference = num1-num2;
                result.setText(Integer.toString(num1)+"-"+Integer.toString(num2)+" = "+Integer.toString(difference));
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(eText1.getText().toString());
                int num2= Integer.parseInt(eText2.getText().toString());
                int product = num1*num2;
                result.setText(Integer.toString(num1)+"*"+Integer.toString(num2)+" = "+Integer.toString(product));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get data which is in edittext, convert it to string
                // using parseInt convert it to Integer type
                int num1= Integer.parseInt(eText1.getText().toString());
                int num2= Integer.parseInt(eText2.getText().toString());
                double div = num1/(double)num2;
                // set it ot result textview
                result.setText(Integer.toString(num1)+"/"+Integer.toString(num2)+" = "+Double.toString(div));
            }
        });



    }
}

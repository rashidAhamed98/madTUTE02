package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static  final String EXTRA_NUMBER1=".com.example.intentsproj.NUMBER1";
    public static  final String EXTRA_NUMBER2=".com.example.intentsproj.NUMBER2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }


    public void sendNumbers(View view){
        Intent intent= new Intent(this, SecondActivity.class);

        EditText editText1=(EditText) findViewById(R.id.editText1);
        String number1= editText1.getText().toString();
        intent.putExtra(EXTRA_NUMBER1, number1);


        EditText editText2=(EditText) findViewById(R.id.editText2);
        String number2= editText2.getText().toString();
        intent.putExtra(EXTRA_NUMBER2, number2);


        Context context =getApplicationContext();
        CharSequence message=" You just clicked the Ok Button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration); toast.show();



        startActivity(intent);

    }



}

package com.example.homework_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
EditText newStudent;
String abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
newStudent = findViewById(R.id.ET_text);
    }

    public void openList(View view) {
        abc = newStudent.getText().toString();
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("key",abc);
        startActivityForResult(intent,42);
    }
}



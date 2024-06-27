package com.example.employeeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
            ed1 = (EditText) findViewById(R.id.empcode);
            ed2 = (EditText) findViewById(R.id.empname);
            ed3 = (EditText) findViewById(R.id.designation);
            ed4 = (EditText) findViewById(R.id.cmpname);
            ed5 = (EditText) findViewById(R.id.sal);
            ed6 = (EditText) findViewById(R.id.num);
            b1 = (AppCompatButton) findViewById(R.id.regbut);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "register button clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
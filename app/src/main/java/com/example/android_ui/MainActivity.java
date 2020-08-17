package com.example.android_ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count=0;
    private TextView no;
    Button toast_id,count_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no=findViewById(R.id.no);
        toast_id=findViewById(R.id.toast_id);
        count_id=findViewById(R.id.count_id);

        count_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                no.setText(count+"");
            }
        });
        toast_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello Toast!",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
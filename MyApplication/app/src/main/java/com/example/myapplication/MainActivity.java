package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    public void btnIncrease_Click(View view){
        int count;
        TextView output = (TextView) findViewById(R.id.txvOutput);
        count = Integer.parseInt(output.getText().toString());
        count++;
        output.setText(Integer.toString(count));
    }

    public void btnDecrease_Click(View view){
        int count;
        TextView output = (TextView) findViewById(R.id.txvOutput);
        count = Integer.parseInt(output.getText().toString());
        count--;
        output.setText(Integer.toString(count));
    }

    public void btnZero_Click(View view){
        TextView output = (TextView) findViewById(R.id.txvOutput);
        output.setText("0");
    }
}
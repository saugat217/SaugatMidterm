package com.example.saugatmidterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    ResultFrag resultFrag;

    EditText number1,number2;
    Button addBtn,subBtn,mulBtn,divBtn;
    int num1,num2;

    public void setData(){
        num1 = Integer.parseInt(String.valueOf(number1.getText()));
        num2 = Integer.parseInt(String.valueOf(number2.getText()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultFrag = new ResultFrag();
        getSupportFragmentManager().beginTransaction().add(R.id.resultfragment, resultFrag).commit();

        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);
        mulBtn = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.divBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData();
                resultFrag.showData(String.valueOf(num1 + num2));
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData();
                resultFrag.showData(String.valueOf(num1 - num2));
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData();
                resultFrag.showData(String.valueOf(num1 * num2));
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData();
                resultFrag.showData(String.valueOf(num1 / num2));
            }
        });
    }
}
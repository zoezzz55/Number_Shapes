package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {
    EditText vNumber;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vNumber = (EditText) findViewById(R.id.editText1);
        bt = (Button) findViewById(R.id.button1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = vNumber.getText().toString();
                TextView result = (TextView) findViewById(R.id.textView3);
                if (number1.equals("")) {
                    result.setText(getString(R.string.warning));
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("number1", number1);
                    int number = Integer.parseInt(bundle.getString("number1"));
                    int x = 1;
                    int triangularNumber = 1;
                    double squareRoot = Math.sqrt(number);
                    if (squareRoot == Math.floor(squareRoot)) {
                        while(triangularNumber< number){
                            x++;
                            triangularNumber = triangularNumber + x;}
                        if(triangularNumber!=number) {
                            result.setText(number1+ "\t"+getString( R.string.square )); }
                        else{ result.setText(number1+"\t"+getString(R.string.both));}
                        }
                    if (squareRoot != Math.floor(squareRoot)) {
                        while(triangularNumber< number){
                            x++;
                            triangularNumber = triangularNumber + x;}
                        if(triangularNumber!=number) {
                            result.setText(number1+ "\t"+getString( R.string.none )); }
                        else{ result.setText(number1+"\t"+getString(R.string.triangular));}
                    }
                }
            }
        });
    }
}



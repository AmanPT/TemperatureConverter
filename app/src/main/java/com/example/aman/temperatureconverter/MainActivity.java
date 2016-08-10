package com.example.aman.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    public void add(View v) {
        TextView result = (TextView) findViewById(R.id.result);
        EditText et1 = (EditText) findViewById(R.id.editText);
        double a = Double.parseDouble(String.valueOf(et1.getText()));
        RadioButton cb = (RadioButton) findViewById(R.id.cb);
        RadioButton fb = (RadioButton) findViewById(R.id.fb);
        if (cb.isChecked()) {


            result.setText(f2c(a) + " degree C");

            fb.setChecked(true);
        } else {

            result.setText(c2f(a) + " degree F");

            cb.setChecked(true);
        }
    }

    private double c2f(double c) {
        return (c * 9) / 5 + 32;
    }

    private double f2c(double f) {
        return (f - 32) * 5 / 9;
    }
}

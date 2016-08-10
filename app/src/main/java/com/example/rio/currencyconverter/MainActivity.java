package com.example.rio.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButtonOnClick(View view){
        EditText dollarFiled = (EditText) findViewById(R.id.dollarsFileds);
        Double dollarAmount = Double.parseDouble(dollarFiled.getText().toString());
        Double takaAmount = dollarAmount * 80 ;
        Log.i("Taka Amount",takaAmount.toString());
        Toast.makeText(getApplicationContext()," ৳ "+takaAmount.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

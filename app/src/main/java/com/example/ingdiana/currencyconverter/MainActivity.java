package com.example.ingdiana.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void convertir(View v) {
        String dato = editText.getText().toString();
        double cantidad = Double.parseDouble(dato);
        double pesos =  cantidad*18.7;
        String nuevaCantidad = String.format("$%.1f pesos",pesos);
        Toast.makeText(this, nuevaCantidad, Toast.LENGTH_LONG).show();

    }

}

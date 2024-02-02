package com.abdullaev.localerus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    String[] strLocal = {"Русский язык", "Английский язык"};
    Button buttonLocal;
    Spinner spinnerLocal;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strLocal);
        spinnerLocal.setAdapter(adapter);
    buttonLocal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Locale locale = new Locale("ru");
            Configuration config = new Configuration();
            config.setLocale(locale);
            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            recreate();
        }
    });

    }
    public void view() {
        buttonLocal = findViewById(R.id.button);
        spinnerLocal = findViewById(R.id.spinner);
        text = findViewById(R.id.textView);
    }



}
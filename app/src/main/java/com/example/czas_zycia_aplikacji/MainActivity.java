package com.example.czas_zycia_aplikacji;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
int licznik = 0;
Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CYKL ZYCIA", "uruchomiona metoda onCreate");
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        if(savedInstanceState != null){
            licznik = savedInstanceState.getInt("LICZNIK");
            textView.setText(""+licznik);
        }
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        licznik++;
                        textView.setText(""+licznik);
                    }
                }
        );
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CYKL ZYCIA", "uruchomiono metode onSaveInstanceState");
        //outState.putInt("LICZNIK", licznik);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CYKL ZYCIA", "uruchomiono metode onStarrt");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CYKL ZYCIA", "uruchomiono metode onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CYKL ZYCIA", "uruchomiono metode onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CYKL ZYCIA", "uruchomiono metode onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CYKL ZYCIA", "uruchomiono metode onStop");
    }

}
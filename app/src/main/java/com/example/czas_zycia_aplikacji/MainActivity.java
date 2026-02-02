package com.example.czas_zycia_aplikacji;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CYKL ZYCIA", "uruchomiona metoda onCreate");

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
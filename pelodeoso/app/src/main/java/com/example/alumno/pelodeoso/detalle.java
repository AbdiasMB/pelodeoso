package com.example.alumno.pelodeoso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("SYSSELL","La aplicacion acaba de ingresar a onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("SYSSELL","La aplicacion esta en pausa");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("SYSSELL","La aplicacion se esta cerrando");
    }

}

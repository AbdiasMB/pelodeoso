package com.example.alumno.pelodeoso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alumno.pelodeoso.R;

public class loginActivity extends AppCompatActivity {

    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent( loginActivity.this, ProductosV .class);
                loginActivity.this.startActivity(x);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("SYSSELL","La aplicacion acaba de ingresar a onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Bienvenido a Pelo de Oso", Toast.LENGTH_SHORT).show();
        Log.v("SYSSELL","La aplicacion esta continuando...");
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

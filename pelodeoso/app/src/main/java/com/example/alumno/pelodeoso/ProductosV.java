package com.example.alumno.pelodeoso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProductosV extends AppCompatActivity {

    Button btnPrenda1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_v);

        Button btnPrenda1 = (Button) findViewById(R.id.btnPrenda1);
        btnPrenda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent( ProductosV.this, detalle.class);
                ProductosV.this.startActivity(x);
            }
        });

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

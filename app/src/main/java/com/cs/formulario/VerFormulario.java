package com.cs.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VerFormulario extends AppCompatActivity {

    TextView nombreVer;
    TextView correoVer;
    TextView telefonoVer;
    Button buttonOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_formulario);

        nombreVer = (TextView) findViewById(R.id.verNombre);
        correoVer = (TextView) findViewById(R.id.verCorreo);
        telefonoVer = (TextView) findViewById(R.id.verTelefono);
        buttonOk = (Button) findViewById(R.id.btnOk);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerFormulario.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mostrarInformacion();

    }

    public void mostrarInformacion(){

        Bundle datosMostrar = this.getIntent().getExtras();
        String nombre = datosMostrar.getString("nombreVer");
        String correo = datosMostrar.getString("correoVer");
        String telefono = datosMostrar.getString("telefonoVer");

        nombreVer.setText(nombre);
        correoVer.setText(correo);
        telefonoVer.setText(telefono);

    }
}
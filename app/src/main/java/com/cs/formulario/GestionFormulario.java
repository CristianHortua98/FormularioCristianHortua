package com.cs.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GestionFormulario extends AppCompatActivity {

    EditText text_nombre;
    EditText text_correo;
    EditText text_telefono;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_formulario);

        text_nombre = (EditText)findViewById(R.id.nuevoNombre);
        text_correo = (EditText)findViewById(R.id.nuevoCorreo);
        text_telefono = (EditText) findViewById(R.id.nuevoTelefono);
        aceptar = (Button) findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = text_nombre.getText().toString();
                String correo = text_correo.getText().toString();
                String telefono = text_telefono.getText().toString();

                Intent i = new Intent(GestionFormulario.this, VerFormulario.class);

                i.putExtra("nombreVer", nombre);
                i.putExtra("correoVer", correo);
                i.putExtra("telefonoVer", telefono);

                startActivity(i);

            }
        });

    }
}
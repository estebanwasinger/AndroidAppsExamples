package com.example.esteban.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends Activity {
    HomePersonas homePersonas = HomePersonas.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void guardarPersona(View view) {
        final EditText nombre = (EditText) findViewById(R.id.eTNombre);
        final EditText apellido = (EditText) findViewById(R.id.eTApellido);
        final EditText edad = (EditText) findViewById(R.id.eTEdad);
        final EditText nacionalidad = (EditText) findViewById(R.id.eTnacionalidad);

        String nombreString = nombre.getText().toString();
        if (!validarString(nombreString)) {
            mostrarToast("Nombre ingresado incorrecto");
            nombre.setBackgroundColor(Color.RED);
            return;
        }
        String apellidoString = apellido.getText().toString();
        if (!validarString(apellidoString)) {
            mostrarToast("Apellido ingresado incorrecto");
            return;
        }
        Integer edadInt = Integer.parseInt(edad.getText().toString());
        String nacionalidadString = nacionalidad.getText().toString();
        if (!validarString(nacionalidadString)) {
            mostrarToast("Nacionalidad ingresado incorrecto");
            return;
        }

        homePersonas.addPersona(new Persona(edadInt, nombreString, apellidoString, nacionalidadString));
        ((TextView) findViewById(R.id.textView)).setText(homePersonas.size().toString());
        final ListView listaPersonas = (ListView) findViewById(R.id.listView2);

    }

    private boolean validarString(String string) {
        if (string == "" || string.length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    private void mostrarToast(String string) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, string, Toast.LENGTH_SHORT);
        toast.show();
    }


}

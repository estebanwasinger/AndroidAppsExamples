package com.example.esteban.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;


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

    public void guardar(View view) {
        final EditText nombre = (EditText) findViewById(R.id.eTNombre);
        final EditText apellido = (EditText) findViewById(R.id.eTApellido);
        final EditText edad = (EditText) findViewById(R.id.eTEdad);
        final EditText nacionalidad = (EditText) findViewById(R.id.eTnacionalidad);

        String nombreString = nombre.getText().toString();
        String apellidoString = apellido.getText().toString();
        Integer edadInt = Integer.parseInt(edad.getText().toString());
        String nacionalidadString = nacionalidad.getText().toString();

        homePersonas.addPersona(new Persona(edadInt, nombreString, apellidoString, nacionalidadString));
        ((TextView) findViewById(R.id.textView)).setText(homePersonas.size().toString());
        final ListView listaPersonas = (ListView) findViewById(R.id.listView2);
    }

    public void saludar(View view){
//        final TextView textoLoco = (TextView) findViewById(R.id.textView);
//        final Button botonLoco = (Button) findViewById(R.id.botonLoco);
//        final Switch esEspaniol = (Switch) findViewById(R.id.switch1);
//        homePersonas.addPersona(new Persona(21,"Esteban","Wasinger","Argentina"));
//        String string = getString(R.string.espaniol);
//        if (esEspaniol.isChecked()){
//            esEspaniol.setText("ESPAÑOOOOOOL");
//            string = "ESPAÑOOOOOL";
//            botonLoco.setText("Saludar");
//            textoLoco.setText("Hola mundo!");
//        }else{
//            botonLoco.setText("Greets");
//            textoLoco.setText("Hello world!");
//        }
    }

    public void saludar2(View view) {
//        //final Switch esEspaniol = (Switch) findViewById(R.id.switch1);
//        if (esEspaniol.isChecked()){
//            esEspaniol.setText("Español");}
//        else{
//            esEspaniol.setText("Ingles");
//        }
    }


}

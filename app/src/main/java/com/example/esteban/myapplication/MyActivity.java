package com.example.esteban.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;


public class MyActivity extends Activity {


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

    public void saludar(View view){
        final TextView textoLoco = (TextView) findViewById(R.id.textView);
        final Button botonLoco = (Button) findViewById(R.id.botonLoco);
        final Switch esEspaniol = (Switch) findViewById(R.id.switch1);
        if (esEspaniol.isChecked()){
            botonLoco.setText("Saludar");
            textoLoco.setText("Hola mundo!");
        }else{
            botonLoco.setText("Greets");
            textoLoco.setText("Hello world!");
        }
    }


}

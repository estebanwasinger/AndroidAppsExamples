package com.example.esteban.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends Activity {

    int i = 0;

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

    public void cambiarNombre(View view){
        final TextView textoLoco = (TextView) findViewById(R.id.textView);
        final TextView botonLoco = (Button) findViewById(R.id.botonLoco);
        if ((i%2)==0){
            botonLoco.setText("Hola");
            textoLoco.setText("Hola mundo PAPAAA "+i);
            i++;
        }else{
            botonLoco.setText("Hello");
            textoLoco.setText("Hello world! "+i);
            i++;
        }
    }


}

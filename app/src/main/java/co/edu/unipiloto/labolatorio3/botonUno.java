package co.edu.unipiloto.labolatorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class botonUno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton_uno);

    }

    public void CambiarSiguiente(View view) {
        Intent intent=new Intent(this, botondos.class);
        startActivity(intent);
    }
}
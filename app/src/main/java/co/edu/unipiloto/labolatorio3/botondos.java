package co.edu.unipiloto.labolatorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class botondos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton_dos);
    }

    public void CambiarSiguiente(View view) {
        Intent intent=new Intent(this, botonTres.class);
        startActivity(intent);
    }

}
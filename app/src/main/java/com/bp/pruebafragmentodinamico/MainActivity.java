package com.bp.pruebafragmentodinamico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Para agregar un fragmento o cualquier otra transacción*/

        //Se recupera el FragmentManager.
        getFragmentManager().beginTransaction() //Se inicia la transaccion.
                .add(R.id.contenedor, new PlaceHolderFragment()) //Procesamiento, en este caso agregar.
                //Recibe el id de la zona donde agregarlo y la instancia del fragmento a agregar.
                .addToBackStack(null) //Permite la transacción incluso si el usuario pulsa "atrás".
                .commit(); //Validación de la transacción.

        getFragmentManager().findFragmentById(R.id.contenedor); //Una actividad puede comunicarse con un fragmento.
    }
}

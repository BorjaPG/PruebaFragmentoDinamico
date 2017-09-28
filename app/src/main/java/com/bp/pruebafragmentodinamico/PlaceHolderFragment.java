package com.bp.pruebafragmentodinamico;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by borja on 28/9/17.
 */

public class PlaceHolderFragment extends Fragment {

    //Permite crear instancias del fragmento.
    public PlaceHolderFragment(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.activity_main,container, false);
        //getActivity().findViewById(R.id.activity_main); //Un fragmento puede comunicarse con una actividad.
        return rootView;
    }
}

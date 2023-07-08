package com.example.ejercicioindividual14m5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejercicioindividual14m5.databinding.FragmentFragmento2Binding;
import com.example.ejercicioindividual14m5.databinding.FragmentPreguntaBinding;

public class Fragmento2 extends Fragment {

    private FragmentFragmento2Binding abinding;
    private String nombre1;
    private String nombre2;
    //private static final String ARG_PARAM1 = "clave1";
    //private static final String ARG_PARAM2 = "clave2";

    public Fragmento2() {
        // Required empty public constructor
    }

    public static Fragmento2 newInstance(String nombre1, String nombre2) {
        Fragmento2 fragment = new Fragmento2();
        Bundle args = new Bundle();
        args.putString("clave1", nombre1);
        args.putString("clave2", nombre2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            nombre1 = getArguments().getString("clave1");
            nombre2 = getArguments().getString("clave2");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        abinding = FragmentFragmento2Binding.inflate(inflater, container, false);
        return abinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        abinding.nombre1.setText(nombre1);
        abinding.nombre2.setText(nombre2);
    }

}
package com.example.aplicaciones3.lista.adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class AdaptadorPersona extends BaseAdapter {
    ArrayList<Persona> lp;
    Context c;

    public AdaptadorPersona(ArrayList<Persona> lp, Context c){
        this.lp=lp;
        this.c=c;
    }

    @Override
    public int getCount() {
        return lp.size();
    }

    @Override
    public Object getItem(int position) {
        return lp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lp.get(position).get;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}

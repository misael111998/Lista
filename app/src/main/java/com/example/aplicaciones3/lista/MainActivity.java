package com.example.aplicaciones3.lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lt=(ListView)findViewById(R.id.list);
        String alumnos[]={"juan","misael","johny","marco","tony","jorge","Edson","Alejandra","Cynthia","Axel","Ramirin","Marilu","Favio","Iovana","Diego","Dani","Martin","Juan"};
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alumnos);
        lt.setAdapter(aa);
    }
}

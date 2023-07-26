package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listview;
TextView txt;
Spinner spinner;
AutoCompleteTextView autocomplete;
ArrayList<String> arrname=new ArrayList<>();
ArrayList<String> arrid=new ArrayList<>();
ArrayList<String> arrcourse=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
        txt=findViewById(R.id.txt);
        spinner=findViewById(R.id.spinner);
        autocomplete=findViewById(R.id.autoComplete);
        arrname.add("Shakil");
        arrname.add("Shakib");
        arrname.add("Munna");
        arrname.add("Afana");
        arrname.add("Alufa");
        arrname.add("Sweet");
        arrname.add("Bulbul");
        arrname.add("Shakil");
        arrname.add("Shakib");
        arrname.add("Munna");
        arrname.add("Afana");
        arrname.add("Alufa");
        arrname.add("Sweet");
        arrname.add("Bulbul");
        arrname.add("Shakil");
        arrname.add("Shakib");
        arrname.add("Munna");
        arrname.add("Afana");
        arrname.add("Alufa");
        arrname.add("Sweet");
        arrname.add("Bulbul");

        arrname.add("Shakil");
        arrname.add("Shakib");
        arrname.add("Munna");
        arrname.add("Afana");
        arrname.add("Alufa");
        arrname.add("Sweet");
        arrname.add("Bulbul");

        arrname.add("Shakil");
        arrname.add("Shakib");
        arrname.add("Munna");
        arrname.add("Afana");
        arrname.add("Alufa");
        arrname.add("Sweet");
        arrname.add("Bulbul");

        arrid.add("NULL ID");
        arrid.add("2023");
        arrid.add("205");
        arrid.add("208");
        arrid.add("209");
        arrid.add("502");
        arrid.add("222");
        arrid.add("292");

        arrcourse.add("oop");
        arrcourse.add("pop");
        arrcourse.add("numerical math");
        arrcourse.add("data structure");
        arrcourse.add("computer ");
        arrcourse.add("machine learning");
        arrcourse.add("datamining");
        arrcourse.add("Engineering mathematics");
        arrcourse.add("problem solving");
        arrcourse.add("object orented");
        arrcourse.add("pop");
        arrcourse.add("numerical math");
        arrcourse.add("data structure");
        arrcourse.add("computer ");
        arrcourse.add("machine learning");
        arrcourse.add("datamining");
        arrcourse.add("Engineering mathematics");
        arrcourse.add("problem solving");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,arrname);
        ArrayAdapter<String> spadapter=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrid);
        ArrayAdapter<String> auadapter =new ArrayAdapter<>(getApplication(), android.R.layout.simple_list_item_1,arrcourse);
        listview.setAdapter(adapter);
        spinner.setAdapter(spadapter);
        autocomplete.setAdapter(auadapter);
        autocomplete.setThreshold(1);



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this, "Shakil is a boss", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
}
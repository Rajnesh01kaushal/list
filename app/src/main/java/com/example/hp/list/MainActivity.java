package com.example.hp.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);


//        String[] Groceries = {"BigBasket","PayTm","Amazon","Grofers","LocalBanaya"};
        final String[] Groceries = getResources().getStringArray(R.array.Groceries);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1
                Groceries);


        listView.setAdapter(adapter);

//        read click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Groceries"+Groceries[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}

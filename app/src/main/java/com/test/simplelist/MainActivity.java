package com.test.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.myList);
        String[] versions={"Oreo","Pie","R","Marchmallow","Nougat","Kitkat"};
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,versions);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"you clickd the item number "+i,Toast.LENGTH_SHORT ).show();
                Intent intent=new Intent(getBaseContext(),Selected_Item.class);
                intent.putExtra("index",i);
                startActivity(intent);
            }
        });
    }
}
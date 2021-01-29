package com.test.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Selected_Item extends AppCompatActivity {
    TextView selectedIndexText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected__item);
        selectedIndexText=findViewById(R.id.selectedItemText);
        if(getIntent()!=null){
            int index=getIntent().getExtras().getInt("index");
            selectedIndexText.setText("the selected index is "+index);
        }
    }
}
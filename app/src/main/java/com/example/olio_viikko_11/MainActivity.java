package com.example.olio_viikko_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText itemInput;
    private Item item;

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemInput = findViewById(R.id.etItemText);
        item = new Item(itemInput.getText().toString());
        rv = findViewById(R.id.rvItemList);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new ItemListAdapter(getApplicationContext(), item.getItemList()));


    }




    public void addItem (View view) {
        item.addItem(new Item(itemInput.getText().toString()));

    }





}
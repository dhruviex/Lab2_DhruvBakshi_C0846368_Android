package com.example.lab2_dhruvbakshi_c0846368_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView dataListView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseActivity g=new DatabaseActivity(this);
        SQLiteDatabase db = g.getReadableDatabase();
        initWidgets();
        setDataAdapter();

    }


    private void initWidgets() {

        dataListView = findViewById(R.id.dataListView);
    }
    private void setDataAdapter() {
      DataAdapter dataAdapter = new DataAdapter(getApplicationContext(),Product.productArrayList);
      dataListView.setAdapter(dataAdapter);

    }
    public void NewList(View view) {
        Intent newDataIntent = new Intent(this, NewDataActivity.class);
        startActivity(newDataIntent);
    }
}
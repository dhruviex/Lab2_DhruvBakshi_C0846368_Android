package com.example.lab2_dhruvbakshi_c0846368_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewDataActivity extends AppCompatActivity {

    private EditText nameEditText,descEditText,priceEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_data);
        initWidgets();
        
    }

    private void initWidgets() {
        nameEditText = findViewById(R.id.nameEditText);
        descEditText = findViewById(R.id.descriptionEditText);
        priceEditText = findViewById(R.id.priceEditText);

    }

    public void saveList(View view) {
        String name = String.valueOf(nameEditText.getText());
        String description = String.valueOf(descEditText.getText());
        String price = String.valueOf(priceEditText.getText());

        int id = Product.productArrayList.size();
        Product newProduct = new Product(id,name,description,price);
        Product.productArrayList.add(newProduct);
        finish();
    }
}
package com.example.lab2_dhruvbakshi_c0846368_android;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseActivity extends SQLiteOpenHelper {

private static final String dbname="product.db";

    public DatabaseActivity(@Nullable Context context) {
        super(context, dbname,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
     String q="Create Table product(prodId integer primary key autoincrement , prodName text,prodDesc text,prodPric int)";
        sqLiteDatabase.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

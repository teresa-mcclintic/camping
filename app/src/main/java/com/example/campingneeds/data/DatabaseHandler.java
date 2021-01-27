package com.example.campingneeds.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import androidx.annotation.Nullable;

public class DatabaseHandler extends SQLiteOpenHelper {
    private final Context context;

    public DatabaseHandler(@Nullable Context context) {
        super(context, Constants.DB_NAME, null, Constants.DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CAMP_TABLE = "CREATE TABLE"+ Constants.TABLE_NAME + "("
                +Constants.KEY_ID +" INTEGER PRIMARY KEY,"
                +Constants.KEY_CAMP_ITEM+" INTEGER,"
                +Constants.KEY_COLOR+" TEXT,"
                +Constants.KEY_QTY_NUMBER+" TEXT,"
                +Constants.KEY_ITEM_SIZE+" INTEGER,"
                +Constants.KEY_DATE_NAME+" LONG);";
        db.execSQL(CREATE_CAMP_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Constants.TABLE_NAME);
        onCreate(db);
    }
    //CRUD Operations
}

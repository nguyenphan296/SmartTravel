package com.example.pkun9.smarttravel.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static com.example.pkun9.smarttravel.SQLite.DbScript.CreateTable;
import static com.example.pkun9.smarttravel.SQLite.DbScript.UpdateTable;


/**
 * Created by sang on 17/01/2017.
 */

public class DataBaseHandler extends SQLiteOpenHelper {

    private static final String TAG = "DataBaseHandler";
    // Phien ban DB
    private static final  int DATABASE_VERSION = 1;
    // Ten CSDL
    private static final String DATABASE_NAME = "Smart_Travel";


    public DataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    // Tao cac bang
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG, "DataBaseHandler.onCreate ....");
        CreateTable(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        UpdateTable(db);
    }

}

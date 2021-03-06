package com.example.pets.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PetDpHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="shelter.dp";

    private static final int DATABASE_VERSION= 1;

    public PetDpHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       String SQL_CREATE_PETS_TABLE= "CREATE TABLE "+ PetContract.PetEntry.Table_Name+"("+ PetContract.PetEntry._ID+
                " INTEGER PRIMARY KEY AUTOINCREMENT, "+ PetContract.PetEntry.COLUMN_PET_NAME+" TEXT NOT NULL, "+
                PetContract.PetEntry.COLUMN_PET_BREED+" TEXT, "+ PetContract.PetEntry.COLUMN_PET_GENDER+" INTEGER NOT NULL, "+
                PetContract.PetEntry.COLUMN_PET_WEIGHT+" INTEGER NOT NULL DEFAULT 0);";

       db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

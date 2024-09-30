package com.example.thuexe.Utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class UserDPHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = Utils.DATABASE_NAME;
    private static final int DATABASE_VERSION = 1;

    public UserDPHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_USER_TABLE = " CREATE TABLE" + Utils.TABLE_USER + "("
                + Utils.COLUMN_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Utils.COLUMN_USER_NAME + " TEXT, "
                + Utils.COLUMN_USER_AVATAR + " TEXT, "
                + ")";
        sqLiteDatabase.execSQL(CREATE_USER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase  sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" +  Utils.TABLE_USER);
    onCreate(sqLiteDatabase);
    }
}

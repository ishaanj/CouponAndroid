package com.hzs.couponandroid.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayOutputStream;

/**
 * Created by Yue on 27-Jul-16.
 *
 * Contains the methods and constants to manage the database
 */
public class CouponDB extends SQLiteOpenHelper {

    // Main table which contains coupon data
    public static final String TABLE_COUPONS = "COUPONS";
    public static final String COL_ID = "_ID";
    public static final String COL_COUPON_NAME = "C_NAME";
    public static final String COL_COUPON_IMG = "C_IMG";
    public static final String COL_COUPON_TEXT1 = "C_TEXT_1";
    public static final String COL_COUPON_TEXT2 = "C_TEXT_2";

    // Some constants for the database
    private static final String DB_NAME = "CouponDB.db";
    private static final int VERSION = 1;

    private static final String CREATE_TABLE_COUPONS = "CREATE TABLE " + TABLE_COUPONS + "(" +
                                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                COL_COUPON_NAME + " TEXT, " +
                                COL_COUPON_IMG + " BLOB, " +
                                COL_COUPON_TEXT1 + " TEXT, " +
                                COL_COUPON_TEXT2 + " TEXT);";

    public CouponDB(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_COUPONS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_COUPONS);
        sqLiteDatabase.execSQL(CREATE_TABLE_COUPONS);
    }

    // Helper method to convert a bitmap image into a byte array to store as a blob in DB
    public static byte[] convertBitmapToByteArray(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, stream);
        return stream.toByteArray();
    }

    // Helper method to convert a byte array from DB into a bitmap
    public static Bitmap convertByteArrayToBitmap(byte[] data) {
        return BitmapFactory.decodeByteArray(data, 0, data.length);
    }
}

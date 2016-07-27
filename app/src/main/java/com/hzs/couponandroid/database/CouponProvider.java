package com.hzs.couponandroid.database;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;

/**
 * Created by Yue on 27-Jul-16.
 *
 * Contains the Content Provider which will help work easily with the CouponDB.
 */
public class CouponProvider extends ContentProvider {
    private CouponDB db;
    public static final String AUTHORITY = "com.hzs.couponandroid.database";
    public static final Uri COUPON_URI = Uri.parse("content://" + AUTHORITY + "/" + CouponDB.TABLE_COUPONS);

    private static final int COUPONS = 1;
    private static final int COUPON_ID = 2;

    private static UriMatcher matcher;
    static {
        matcher = new UriMatcher(UriMatcher.NO_MATCH);
        matcher.addURI(AUTHORITY, CouponDB.TABLE_COUPONS, COUPONS);
        matcher.addURI(AUTHORITY, CouponDB.TABLE_COUPONS + "/#", COUPON_ID);
        // Add more tables if required
    }

    @Override
    public boolean onCreate() {
        db = new CouponDB(getContext());
        return db.getWritableDatabase() != null;
    }

    @Override
    public Uri insert(@NonNull Uri uri, ContentValues values) {
        Uri tempUri = null;
        String table = null;

        switch(matcher.match(uri)) {
            case COUPONS:
                tempUri = COUPON_URI;
                table = CouponDB.TABLE_COUPONS;
                break;

            // Add more tables if needed
        }

        long id = db.getWritableDatabase().insert(table, null, values);

        if(id > 0) {
            Uri u = ContentUris.withAppendedId(tempUri, id);
            getContext().getContentResolver().notifyChange(u, null);
            return u;
        }
        throw new SQLException("Could not insert record : " + uri);
    }

    @Override
    public Cursor query(@NonNull Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteQueryBuilder builder = new SQLiteQueryBuilder();

        switch(matcher.match(uri)) {
            case COUPONS:
                builder.setTables(CouponDB.TABLE_COUPONS);
                break;

            case COUPON_ID:
                builder.setTables(CouponDB.TABLE_COUPONS);
                builder.appendWhere(CouponDB.COL_ID + "=" + uri.getPathSegments().get(1));
                break;

            // Add more tables if needed
        }

        if(TextUtils.isEmpty(sortOrder)) {
            sortOrder = CouponDB.COL_COUPON_NAME;
        }

        Cursor cursor = builder.query(db.getReadableDatabase(), projection, selection, selectionArgs, null, null, sortOrder);
        cursor.setNotificationUri(getContext().getContentResolver(), uri);
        return cursor;
    }

    @Override
    public int delete(@NonNull Uri uri, String selection, String[] selectionArgs) {
        int count = 0;

        switch (matcher.match(uri)) {
            case COUPONS:
                count = db.getWritableDatabase().delete(CouponDB.TABLE_COUPONS, selection, selectionArgs);
                break;

            case COUPON_ID:
                String id = uri.getPathSegments().get(1);
                count = db.getWritableDatabase().delete(CouponDB.TABLE_COUPONS, CouponDB.COL_ID +  " = " + id +
                        (!TextUtils.isEmpty(selection) ? " AND (" + selection + ')' : ""), selectionArgs);
                break;

            // Add more tables if needed
        }

        getContext().getContentResolver().notifyChange(uri, null);
        return count;
    }

    @Override
    public int update(@NonNull Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        int count = 0;

        switch (matcher.match(uri)) {
            case COUPONS:
                count = db.getWritableDatabase().update(CouponDB.TABLE_COUPONS, values, selection, selectionArgs);
                break;

            case COUPON_ID:
                String id = uri.getPathSegments().get(1);
                count = db.getWritableDatabase().update(CouponDB.TABLE_COUPONS, values, CouponDB.COL_ID + " = " + id +
                        (!TextUtils.isEmpty(selection) ? " AND (" +selection + ')' : ""), selectionArgs);
                break;

            // Add more tables if needed
        }

        getContext().getContentResolver().notifyChange(uri, null);
        return count;
    }

    @Override
    public String getType(@NonNull Uri uri) {
        switch (matcher.match(uri)) {
            case COUPONS:
                return "vnd.android.cursor.dir/vnd.coupons.coupons";

            case COUPON_ID:
                return "vnd.android.cursor.item/vnd.coupons.coupons";

            // Add more matches if needed
        }

        throw new IllegalArgumentException("Unsupported URI : " + uri);
    }




}

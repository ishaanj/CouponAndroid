package com.hzs.couponandroid;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class ProfileActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbar;

    public static final String KEY_USERNAME = "USERNAME";
    public static final String KEY_PROFILE_IMG_URI = "IMAGE_URI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.profile_toolbar_layout);

        // Get username
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String username = sp.getString(KEY_USERNAME, "");
        collapsingToolbar.setTitle("Hello " + (!TextUtils.isEmpty(username)? ", " + username: ""));

        ImageView profilePhoto = (ImageView) findViewById(R.id.profile_photo);
        String uri = sp.getString(KEY_PROFILE_IMG_URI, "");

        if (TextUtils.isEmpty(uri)) {
            Picasso.with(this).load(R.drawable.placeholder).into(profilePhoto);
        }
        else {
            Picasso.with(this).load(uri).placeholder(R.drawable.placeholder).into(profilePhoto);
        }

    }
}

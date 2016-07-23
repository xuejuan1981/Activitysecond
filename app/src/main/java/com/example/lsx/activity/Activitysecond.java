package com.example.lsx.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class Activitysecond extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String inforcontent = getIntent().getStringExtra("name");
        Toast.makeText(Activitysecond.this,inforcontent,Toast.LENGTH_SHORT).show();
    }




}

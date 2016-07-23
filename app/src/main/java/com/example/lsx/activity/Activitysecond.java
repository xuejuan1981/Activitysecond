package com.example.lsx.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class Activitysecond extends AppCompatActivity {
   private TextView textView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.second_activity);
        String inforcontent = getIntent().getStringExtra(MainActivity.BOOK_NAME_OF_CATEGORY_PHYSICAL);
        textView =(TextView) findViewById(R.id.second_activity_text_view);
        textView.setText(inforcontent);
    }




}

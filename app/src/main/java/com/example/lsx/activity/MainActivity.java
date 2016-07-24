package com.example.lsx.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String BOOK_NAME_OF_CATEGORY_PHYSICAL = "bookNameOfCategoryPhysical";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: 执行了 ");
        Button button = (Button) findViewById(R.id.activity_main_button);
        final EditText editText = (EditText)findViewById(R.id.activity_main_edit_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");
                Intent intent = new Intent(MainActivity.this,Activitysecond.class);
                intent.putExtra(BOOK_NAME_OF_CATEGORY_PHYSICAL,editText.getText().toString());
                startActivityForResult(intent,0);
            }
        });
        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        String name = data.getStringExtra("back");
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 执行了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 执行了 ");
        
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause:  执行了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 执行了 ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop:  执行了");
    }
}

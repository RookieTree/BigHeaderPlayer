package com.tree.bigheaderplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.tree.bigheaderplayer.util.logger.LogHelper;


public class MainActivity
        extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onResume() {
        super.onResume();
        LogHelper.d("ananananan");
        Toast.makeText(this, "logger", Toast.LENGTH_SHORT)
             .show();
    }
}

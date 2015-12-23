package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAsyncTask task = new MyAsyncTask();
        task.execute();
    }
    public void loadImage(View view){
        startActivity(new Intent(this, ImageTest.class));
    }
    public void loadProgress(View view){
        startActivity(new Intent(this,ProgressBarTest.class));
    }
}

package com.example.administrator.myapplication;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by Administrator on 2015/12/14.
 */
public class MyAsyncTask extends AsyncTask<Void,Void,Void>{
    @Override
    protected Void doInBackground(Void... params) {
        Log.d("aaa","doInBackground");
        return null;
    }
    @Override
    protected void onPreExecute() {
        Log.d("aaa","onPreExecute");
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        Log.d("aaa","onPostExecute");
        super.onPostExecute(aVoid);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        Log.d("aaa","onProgressUpdate");
        super.onProgressUpdate(values);
    }
}

package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ProgressBar;

/**
 * Created by Administrator on 2015/12/15.
 */
public class ProgressBarTest extends Activity{
    private ProgressBar mProgressBar;
    private MyAsycTask mTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbar);
        mProgressBar =(ProgressBar)findViewById(R.id.pg);
        mTask = new MyAsycTask();
        mTask.execute();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(mTask!=null&&mTask.getStatus()==AsyncTask.Status.RUNNING){
            mTask.cancel(true);
        }
    }

    class MyAsycTask extends AsyncTask<Void,Integer,Void>{
        @Override
        protected Void doInBackground(Void... params) {
            for (int i=0;i<100;i++){
                if(isCancelled()){
                    break;
                }
                publishProgress(i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            if(isCancelled()){
                return;
            }
            mProgressBar.setProgress(values[0]);
        }
    }
}

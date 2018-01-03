package com.example.hpp.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Test1Activity extends BaseActivity {

    private static final String TAG = "Test1Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        Log.d(TAG, "onCreate");

        TextView tv = (TextView)findViewById(R.id.textView1);
        Intent it = getIntent();
        tv.setText(it.getStringExtra(MainActivity.PARAM_KEY1));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    public void onButtonActivity1Click(View v){
        Intent it = new Intent(this, Test1Activity.class);
        startActivity(it);
    }

    public void onButtonActivity2Click(View v){
        Intent it = new Intent(this, Test2Activity.class);
        startActivity(it);
    }
}

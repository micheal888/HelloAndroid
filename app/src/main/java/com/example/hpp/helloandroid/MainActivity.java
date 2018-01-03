package com.example.hpp.helloandroid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    public static final String PARAM_KEY1 = "param_activity1";
    public static final String PARAM_KEY2 = "param_activity2";
    public static final String PARAM_KEY3 = "param_activity3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
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

    /* start an activity */
    public static void actionStart(Context context, Class<?> cls, String key, String msg){
        Intent it = new Intent(context, cls);
        it.putExtra(key, msg);
        context.startActivity(it);
    }

    /* start Test2Activity */
    public void onButton1Click(View v)
    {
        EditText et = (EditText) findViewById(R.id.editTextInfo);
        String msg = et.getText().toString();
        MainActivity.actionStart(MainActivity.this, Test2Activity.class, PARAM_KEY2, msg);
    }
    /* start Test3DlgActivity */
    public void onButton2Click(View v)
    {
        EditText et = (EditText) findViewById(R.id.editTextInfo);
        String msg = et.getText().toString();
        MainActivity.actionStart(MainActivity.this, Test3DlgActivity.class, PARAM_KEY3, msg);
    }
    /* open url */
    public void onButton3Click(View v)
    {
        //Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.baidu.com"));
        //startActivity(it);
    }

    /* create menu */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;//show the menu
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_item1:
            {
                EditText et = (EditText) findViewById(R.id.editTextInfo);
                String msg = et.getText().toString();
                MainActivity.actionStart(MainActivity.this, Test1Activity.class, PARAM_KEY1, msg);
                Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.menu_item2:
            {
                Toast.makeText(this, "you clicked menu item", Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}

package com.example.cmp_277_assignment1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ctr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printLog();
    }

    @Override
    protected void onStart() {
        super.onStart();
        printLog();
    }


    @Override
    protected void onResume() {
        super.onResume();
        printLog();
    }


    @Override
    protected void onPause() {
        super.onPause();
        printLog();
    }


    @Override
    protected void onStop() {
        super.onStop();
        printLog();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        printLog();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        incrementCounter();
        printLog();

    }

    // Switches Activity
    public void switchActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }


    public void launchDialog(View view) {
        AlertDialog.Builder alert1 = new AlertDialog.Builder(MainActivity.this)
                .setCancelable(true)
                .setMessage("this is a dialog box")
                .setCancelable(true)
                .setNeutralButton("close this", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        printLog();
        AlertDialog dialog1 = alert1.create();
        dialog1.show();
    }

    private void printLog(){
        Log.e("Main Activity",Thread.currentThread().getStackTrace()[3].getMethodName());
    }


    private void incrementCounter() {
        ctr++;
        TextView txtHello = (TextView)findViewById(R.id.helloworld);
        txtHello.setText("Counter = " +  ctr);
    }

}
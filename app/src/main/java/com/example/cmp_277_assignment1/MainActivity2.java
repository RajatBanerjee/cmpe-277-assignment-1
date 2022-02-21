package com.example.cmp_277_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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

            printLog();

        }


        private void printLog(){
            Log.e("Secondary Activity",Thread.currentThread().getStackTrace()[3].getMethodName());
        }

        public void endAct(View view){
            this.finish();
        }
}
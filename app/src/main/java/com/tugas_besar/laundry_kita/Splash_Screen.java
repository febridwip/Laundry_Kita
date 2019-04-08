package com.tugas_besar.laundry_kita;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splash_Screen extends Activity {

    //Mengeset waktu lamanya splashscreen
    private static int splashInterval = 7000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(Splash_Screen.this, Login_form.class);
                startActivity(i);

                // Jeda selesai Splash_Screen
                this.finish();
            }

            private void finish() {
            }
        }, splashInterval);
    }
    ;
}

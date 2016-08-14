package com.duylb.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        this.getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {

           /*
           * Đây là phần thiết lập thời gian chờ cho màn hình Splash Sceen
           * Sau khoảng thời gian là  2000ms (2s) màn hình sẽ chuyển sang giao
           * diện chính MainActivity
           * */

            @Override
            public void run() {
                // Sau khi hết thời gian sẽ gọi MainActivity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                // đóng activity SplashScreen
                finish();
            }
        }, 3000);
    }
}

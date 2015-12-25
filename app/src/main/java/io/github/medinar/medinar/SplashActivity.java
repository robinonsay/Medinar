package io.github.medinar.medinar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.firebase.client.Firebase;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Firebase.setAndroidContext(this);
        //Intent loginIntent = new Intent(this, )
    }
}

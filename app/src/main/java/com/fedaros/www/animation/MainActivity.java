package com.fedaros.www.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView bart, homer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bart = (ImageView) findViewById(R.id.bartimageView);
        homer = (ImageView) findViewById(R.id.homer);
    }

    //fade method to fade out bart Image

    public void fade(View view){
        bart.animate().alpha(0f).setDuration(2000);
        bart.setVisibility(View.GONE);
        homer.setVisibility(View.VISIBLE);
        homer.animate().alpha(1f).setDuration(2000);
    }

    public void fade2(View view){
        homer.animate().alpha(0f).setDuration(2000);
        homer.setVisibility(View.GONE);
        bart.setVisibility(View.VISIBLE);
        bart.animate().alpha(1f).setDuration(2000);
    }
}

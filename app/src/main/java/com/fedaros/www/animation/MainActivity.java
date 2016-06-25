package com.fedaros.www.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //instance variables for ImageView that bart images
    ImageView bart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bart = (ImageView) findViewById(R.id.bartimageView);
        //you can set bart ImageView to be out of the screen and then animate it to be visible.
        bart.setTranslationX(-1000f);
        bart.animate().translationX(0f).setDuration(2000);
    }

    //translate method to translate bart Image.
    public void translate(View view){
        //animate bart using translate
        //bart.animate().translationY(10000f).setDuration(2000);
        //translate to left.
        bart.animate().translationX(-10000f).setDuration(2000);

    }

}

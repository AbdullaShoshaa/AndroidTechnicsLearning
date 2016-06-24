package com.fedaros.www.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //instance variables for ImageView that hold homer and bart images
    ImageView bart, homer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bart = (ImageView) findViewById(R.id.bartimageView);
        homer = (ImageView) findViewById(R.id.homer);
    }

    //fade method to fade out bart Image and show homer image
    public void fade(View view){
        //animate bart to alpha 0 (disappear)
        bart.animate().alpha(0f).setDuration(2000);
        //set bart ImageView to gone so it won't interfere with homer ImageView while clicking.
        bart.setVisibility(View.GONE);
        //set homer ImageView to visible.
        homer.setVisibility(View.VISIBLE);
        //animate homer image to show up using alpha 1f
        homer.animate().alpha(1f).setDuration(2000);
    }

    //fade2 method to fade out homer Image and show bart image.
    public void fade2(View view){
        //animate homer to alpha 0
        homer.animate().alpha(0f).setDuration(2000);
        //set homer ImageView to gone so it won't interfere with bart ImageView while clicking.
        homer.setVisibility(View.GONE);
        //set bart imageview to visible.
        bart.setVisibility(View.VISIBLE);
        //animate bart to show up using alpha 1f
        bart.animate().alpha(1f).setDuration(2000);
    }
}

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

    }

    //a method used to performe multiple animations effects beside scaling.
    public void scale(View view){
        //scale bart by half and translate him and lower the opacity.
        bart.animate().scaleX(0.5f).scaleY(0.5f)
                .translationX(-300).translationY(-300).alpha(0.8f).setDuration(2000);
    }
}

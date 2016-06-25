package com.fedaros.www.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
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


    public void rotate(View view){

        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //int counter = 0;
                //bart.animate().rotation(counter+=50).setDuration(500);
                //create animation object and pass the required arguments.
                Animation animation = new RotateAnimation(360, 0);
                animation.setRepeatCount(Animation.INFINITE);
                animation.setDuration(1000);
                //set the animation object reference to imageView and start the animation effect.
                bart.startAnimation(animation);

            }
        });


    }

}

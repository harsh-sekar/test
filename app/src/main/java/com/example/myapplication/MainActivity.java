package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView mind,power,reality,time,soul,space;
    Animation anim1,anim2;

    int y=1,y_c,y_f;

    int count=0;

    LinearLayout screen;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mind = findViewById(R.id.mind);
        power = findViewById(R.id.power);
        reality = findViewById(R.id.reality);
        time = findViewById(R.id.time);
        soul= findViewById(R.id.soul);
        screen = findViewById(R.id.screen);
        anim1 = AnimationUtils.loadAnimation(this,R.anim.translate_animation1);
        anim2 = AnimationUtils.loadAnimation(this,R.anim.translate_animation2);
        screen.setOnClickListener (v);

    }
     View.OnClickListener v = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(count%2==0){
                animation();
            }

            if(count%2==1){
                animation_2();
            }


        }
    };

    public void animation(){
        mind.startAnimation(anim1);
        power.startAnimation(anim1);
        reality.startAnimation(anim1);
        time.startAnimation(anim1);
        soul.startAnimation(anim1);
        space.startAnimation(anim1);
        anim1.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                count = count+1;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void animation_2(){
        mind.startAnimation(anim2);
        power.startAnimation(anim2);
        reality.startAnimation(anim2);
        time.startAnimation(anim2);
        soul.startAnimation(anim2);
        space.startAnimation(anim2);
        anim2.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                count = count+1;

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}

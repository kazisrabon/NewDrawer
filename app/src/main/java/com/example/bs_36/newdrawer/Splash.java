package com.example.bs_36.newdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by BS-36 on 4/2/2015.
 */
public class Splash extends ActionBarActivity{
    Animation animBlink;
    ImageView imageStar;
    RelativeLayout relativeLayout;
//    private DispCoverG bg;

    //AIzaSyDBAJXOeCSfcQ0TVhq6F8_jxrzOEP1FDwY
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        relativeLayout = (RelativeLayout)findViewById(R.id.fullPage);
        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();
                return false;
            }
        });
//        getSupportActionBar().hide();
        imageStar = (ImageView)findViewById(R.id.startView);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        imageStar.setVisibility(View.VISIBLE);
        imageStar.startAnimation(animBlink);
        animBlink.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}

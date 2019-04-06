package com.gzeinnumer.autoimageslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class MainActivity extends AppCompatActivity {

    FlipperLayout flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flipper = findViewById(R.id.flipper);
        String[] url = new String[]{
            "https://ugetuget.com/wp-content/uploads/2018/06/Technology.jpg",
            "http://aladintips.com/wp-content/uploads/2018/04/j26-e1524467977612.jpg"
        };
        for (int i=0; i<2; i++){
            FlipperView view = new FlipperView(getApplicationContext());
            view.setImageUrl(url[i]).setDescription("Image "+ (i+1));
            flipper.addFlipperView(view);
            view.setOnFlipperClickListener(new FlipperView.OnFlipperClickListener() {
                @Override
                public void onFlipperClick(FlipperView flipperView) {
                    Toast.makeText(MainActivity.this, ""+(flipper.getCurrentPagePosition()+1), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}

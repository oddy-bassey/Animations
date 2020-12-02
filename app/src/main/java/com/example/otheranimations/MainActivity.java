package com.example.otheranimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void animateImage(View view){
        ImageView bartView = (ImageView) findViewById(R.id.bartImage);
        ImageView homerView = (ImageView) findViewById(R.id.homerImage);

        //bartView.animate().rotation(3600).alpha(1).setDuration(1000);
        //bartView.animate().translationYBy(1500).setDuration(2000);
        //bartView.animate().translationX(-1000).setDuration(2000);
        //bartView.animate().rotation(1800).setDuration(1000);
        //bartView.animate().rotation(1800).alpha(0).setDuration(1000);
        //bartView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartView = (ImageView) findViewById(R.id.bartImage);

        bartView.setX(-1000);
        bartView.animate().translationXBy(1000).rotation(3600).alpha(1).setDuration(1000);
    }
}

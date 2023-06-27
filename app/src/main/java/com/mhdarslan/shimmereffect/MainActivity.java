package com.mhdarslan.shimmereffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {
    ShimmerFrameLayout shimmerFrameLayout;
    LinearLayout dataLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shimmerFrameLayout = findViewById(R.id.shimmer_view);
        dataLayout = findViewById(R.id.data_view);


        dataLayout.setVisibility(View.INVISIBLE);
        shimmerFrameLayout.startShimmer();

        Handler handler = new Handler();
        handler.postDelayed(()->{
            dataLayout.setVisibility(View.VISIBLE);
            shimmerFrameLayout.stopShimmer();
            shimmerFrameLayout.setVisibility(View.INVISIBLE);
        }, 5000);
    }
}
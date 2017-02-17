package com.kaplan.pdma.multiplescreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ImageView imageViewHome = (ImageView) findViewById(R.id.imageViewHome);
        TextView textViewRating = (TextView) findViewById(R.id.textViewRating);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int rating = intent.getIntExtra("rating", 0);
        textViewRating.setText(name + ", rating = " + rating + " star(s)");
    }
}

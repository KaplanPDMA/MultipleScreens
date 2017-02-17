package com.kaplan.pdma.multiplescreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextRestaurant = (EditText) findViewById(R.id.editTextRestaurant);
        final RatingBar ratingBarRestaurant = (RatingBar) findViewById(R.id.ratingBarRestaurant);
        Button buttonRestaurant = (Button) findViewById(R.id.buttonRestaurant);

        buttonRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextRestaurant.getText().toString();
                int rating = (int) ratingBarRestaurant.getRating();
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("name", name);
                intent.putExtra("rating", rating);
                startActivity(intent);
            }
        });
    }
}

package com.example.projectnoveai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HotnewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hotnews);

        ImageView discover = findViewById(R.id.discover);
        ((android.view.View) discover).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotnewsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView library = findViewById(R.id.library);
        ((android.view.View) library).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotnewsActivity.this, LibraryActivity.class);
                startActivity(intent);
            }
        });
    }
}
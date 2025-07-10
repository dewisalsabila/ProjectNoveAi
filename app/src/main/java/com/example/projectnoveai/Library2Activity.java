package com.example.projectnoveai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Library2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_library2);

        TextView read = findViewById(R.id.read);
        ((android.view.View) read).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Library2Activity.this, LibraryActivity.class);
                startActivity(intent);
            }
        });

        ImageView library = findViewById(R.id.discover);
        ((android.view.View) library).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Library2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView hotnews = findViewById(R.id.hotnews);
        ((android.view.View) hotnews).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Library2Activity.this, HotnewsActivity.class);
                startActivity(intent);
            }
        });
    }
}
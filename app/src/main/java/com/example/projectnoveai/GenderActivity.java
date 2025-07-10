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

public class GenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gender);

        TextView skip = findViewById(R.id.skip);
        ((android.view.View) skip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenderActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        TextView skip2 = findViewById(R.id.skip2);
        ((android.view.View) skip2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenderActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        TextView skip3 = findViewById(R.id.skip3);
        ((android.view.View) skip3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenderActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
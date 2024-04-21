package com.example.simplerecipeapp;

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

public class MainActivity3 extends AppCompatActivity {

    private ImageView imageViewRecipe;
    private TextView textViewName;
    private ImageView imageViewIngredients;
    private ImageView imageViewInstructors;
    private ImageView imageViewBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        imageViewRecipe = findViewById(R.id.imageViewRecipe);
        textViewName = findViewById(R.id.textViewName);
        imageViewIngredients = findViewById(R.id.imageViewIngredients);
        imageViewInstructors = findViewById(R.id.imageViewInstructors);
        imageViewBack = findViewById(R.id.imageViewBack);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int recipeImageResources = intent.getIntExtra("image_recipe", 0);
        int ingredientsImageResources = intent.getIntExtra("image_ingredients", 0);
        int instructorsImageResources = intent.getIntExtra("image_instructors", 0);

        imageViewRecipe.setImageResource(recipeImageResources);
        textViewName.setText(name);
        imageViewIngredients.setImageResource(ingredientsImageResources);
        imageViewInstructors.setImageResource(instructorsImageResources);

        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
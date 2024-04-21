package com.example.simplerecipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity implements Adapter.OnItemClickListener  {

    private TextView textViewUsers;
    private TextView textViewContent;
    private ImageView image_Background;
    private RecyclerView rv_post;
    private ArrayList<Data>datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        textViewUsers= findViewById(R.id.textViewUsers);
        textViewContent= findViewById(R.id.textViewContent);
        image_Background= findViewById(R.id.image_background);
        rv_post= findViewById(R.id.rv_post);
        rv_post.setHasFixedSize(true);
        rv_post.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        Adapter adapter = new Adapter(Source.datas);
        adapter.setOnItemClickListener(this);
        rv_post.setAdapter(adapter);
    }

    public void onItemClick(Data data) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        intent.putExtra("name", data.getName());
        intent.putExtra("image_recipe", data.getImage2());
        intent.putExtra("image_ingredients", data.getImage_ingredients());
        intent.putExtra("image_instructors", data.getImage_instructors());
        startActivity(intent);

    }
}
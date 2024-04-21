package com.example.simplerecipeapp;

import java.util.ArrayList;

public class Source {

    public static ArrayList<Data>datas = generateDummydatas();

    private static ArrayList<Data> generateDummydatas() {
        ArrayList<Data> datas = new ArrayList<>();
        datas.add(new Data("Classic Aromatic Rendang", R.drawable.image1, R.drawable.recipe1,R.drawable.image11, R.drawable.image111));
        datas.add(new Data("The Mighty Sambal Sotong", R.drawable.image2, R.drawable.recipe2, R.drawable.image22, R.drawable.image222));
        datas.add(new Data("Spicy Peppered Beef Delight", R.drawable.image3, R.drawable.recipe3, R.drawable.image33, R.drawable.image333));
        datas.add(new Data("Golden Glazed Sesame Chicken", R.drawable.image4, R.drawable.recipe4, R.drawable.image44, R.drawable.image444));
        return datas;
    }
}

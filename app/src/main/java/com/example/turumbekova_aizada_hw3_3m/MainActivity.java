package com.example.turumbekova_aizada_hw3_3m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFilms;
    private ArrayList<String> filmList = new ArrayList<>();
    private FilmAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        adapter = new FilmAdapter(filmList);
        rvFilms.setAdapter(adapter);
    }

    private void loadData() {
        filmList.add("Проклятие пиковой дамы");
        filmList.add("Поезд в Пусан");
        filmList.add("Меголодон");
        filmList.add("Барби");
        filmList.add("Человек паук");
        filmList.add("Мстители");
        filmList.add("Цунами");
        filmList.add("Пункт назначение");
        filmList.add("Поговори с ней");
        filmList.add("Приливная волна зомби");

    }

    private void initView() {
        rvFilms = findViewById(R.id.rv_film);

    }
}
package com.example.homework_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList <String> data;
    public MainAdapter (){
        data=new ArrayList<>();
        data.add("Алеев Рустам");
        data.add("Атаканов Айдар");
        data.add("Атаджанов Даврон");
        data.add("Табышева Айым");
        data.add("Нурбашев Бакыт");
        data.add("Касымов Рустам");
        data.add("Джузумалиев Азамат");
        data.add("Джеенбекова Нурзада");
        data.add("Ишимов Аманат");
        data.add("Бектуров Максат");
        data.add("Арстанбеков Рашид");
        data.add("Баймолдинов Даулет");
        data.add("Мамбетова Толкун");
        data.add("Мамбетов Мирлан");
        data.add("Туляев Азиз");
        data.add("Мураталина Джамилия");
        data.add("Борбоев Шатман");
        data.add("Арпачиев Максат");
        data.add("Абыкеева Асель");
        data.add("Беккулов Бакытбек");
        data.add("Вдовик Игорь");
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.viewholder_main,parent,false);
        MainViewHolder viewHolder = new MainViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void addText (String text) {
        data.add(text);
        notifyDataSetChanged();
    }
    public void addStudent(ArrayList<String > data ){
        this.data=data;
    }
}

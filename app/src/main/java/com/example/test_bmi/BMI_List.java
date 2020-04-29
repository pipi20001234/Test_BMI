package com.example.test_bmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;



public class BMI_List extends AppCompatActivity {

    private RecyclerView bmi_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__list);

        Bundle bundle = getIntent().getExtras();
        bmi_list = (RecyclerView) findViewById(R.id.bmi_list);
        String h = bundle.getString("height");
        String w = bundle.getString("weight");
        String bmi = bundle.getString("bmi");
        item_list a = new item_list();
        a.setBmi(bmi);
        a.setHeight(h);
        a.setWeight(w);

        ArrayList<item_list> list = new ArrayList<>();

        list.add(a);
        list.add(a);
        list.add(a);
        Log.d("aa",String.valueOf(list.size()));
        bmi_list = (RecyclerView) findViewById(R.id.bmi_list);
        BMIAdapter Adapter = new BMIAdapter(list);
        bmi_list.setAdapter(Adapter);
        bmi_list.setLayoutManager(new LinearLayoutManager(this));



    }
}

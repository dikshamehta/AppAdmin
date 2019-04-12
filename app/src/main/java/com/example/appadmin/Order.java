package com.example.appadmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Order extends AppCompatActivity {
    TextView dish1, dish2, dish3, dish4, dish5, table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        table = (TextView)findViewById(R.id.table);
        dish1 = (TextView)findViewById(R.id.dish1);
        dish2 = (TextView)findViewById(R.id.dish2);
        dish3 = (TextView)findViewById(R.id.dish3);
        dish4 = (TextView)findViewById(R.id.dish4);
        dish5 = (TextView)findViewById(R.id.dish5);


    }
}

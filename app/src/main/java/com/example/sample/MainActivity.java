package com.example.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    public int count = 0;
    Button order;
    TextView items;
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = findViewById(R.id.items);
        price = findViewById(R.id.price);
        order = (Button) findViewById(R.id.order_btn);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateItems();
            }
        });
    }

    private void updateItems() {
        items.setText(String.valueOf(++count));
        updatePrice();
    }

    private void updatePrice() {
        price.setText(NumberFormat.getCurrencyInstance().format(count * 10));
    }
}
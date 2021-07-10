package com.example.smallactivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstantState)
    {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

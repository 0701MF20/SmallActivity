package com.example.smallactivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class Activity1 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstantState)
    {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button b3=(Button)findViewById(R.id.activity1_id);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Activity1.this, Activity2.class);
                startActivity(i2);
            }
        });
    }
}

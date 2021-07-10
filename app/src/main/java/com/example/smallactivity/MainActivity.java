package com.example.smallactivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button button1=(Button)findViewById(R.id.button_main_id);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,Activity1.class);
                startActivity(i1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflate=getMenuInflater();
        inflate.inflate(R.menu.example1_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1id:
             Toast.makeText(this,"Item 1",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2id:
                Toast.makeText(this,"Item 2",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3id:
                 Toast.makeText(this,"Item 3",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4id:
                Toast.makeText(this,"Item 4",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item5id:
                Toast.makeText(this,"Item 5",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item6id:
                Toast.makeText(this,"Item 6",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
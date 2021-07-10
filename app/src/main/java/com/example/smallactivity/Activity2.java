package com.example.smallactivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
public class Activity2 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstantState)
    {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void showfun(View v)
    {
        PopupMenu POPUP=new PopupMenu(this,v);
        POPUP.setOnMenuItemClickListener(this);
        POPUP.inflate(R.menu.example2_menu);
        POPUP.show();
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.itemm1id:
                Toast.makeText(this,"Itemm 1",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemm2id:
                Toast.makeText(this,"Itemm 2",Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}

package com.coffeeshop.hood.mazzicoffeeshop;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class chonvaitro extends AppCompatActivity {
    ImageButton btnquanly,btnphucvu,btnphache,btnthungan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chonvaitro);
        btnquanly=(ImageButton)findViewById(R.id.btnquanly);
        btnphucvu=(ImageButton)findViewById(R.id.btnphucvu);
        btnphache=(ImageButton)findViewById(R.id.btnphache);
        btnthungan=(ImageButton)findViewById(R.id.btnthungan);
    }
    public void dangnhap(View view){
        Intent i=new Intent(this,dangnhap.class);
        startActivity(i);
    }
}

package com.rowan.myapplicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  public void rowan(View view){
      Toast.makeText(this, "hiiiii", Toast.LENGTH_SHORT).show();
  }
    public void rowan2(View view){
        Toast.makeText(this, "hello.....!", Toast.LENGTH_SHORT).show();
    }
    public void rowan3(View view){
        Toast.makeText(this, "byeeeeeeeeee", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
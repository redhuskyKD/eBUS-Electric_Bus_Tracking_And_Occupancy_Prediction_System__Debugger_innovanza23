package com.example.electricbus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.electricbus.databinding.ActivityFront2Binding;

public class Front2 extends AppCompatActivity {
    ActivityFront2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFront2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
package com.example.expencemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.expencemanager.databinding.ActivityAddExpenseBinding;

public class AddExpenseActivity extends AppCompatActivity {

    ActivityAddExpenseBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddExpenseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
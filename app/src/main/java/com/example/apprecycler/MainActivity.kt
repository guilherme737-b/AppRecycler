package com.example.apprecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apprecycler.data.DataSource
import com.example.apprecycler.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding?=null
    private val binding get()=_binding!!
    private val dataNews by lazy { DataSource.buildSimpleList().toMutableList() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }



}
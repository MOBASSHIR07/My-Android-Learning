package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nameList = listOf("Sadikul", "Rahim", "Karim", "Salam", "Jabin", "Fahim")
       binding.rvNames.layoutManager = LinearLayoutManager(this)
        binding.rvNames.adapter = NameAdapter(nameList)
    }
}
package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val person = intent.getSerializableExtra("Extra_Person") as Person

        binding.tvPerson.text = "${person.name} is ${person.age} from ${person.country}"

        binding.buttonBack.setOnClickListener {
            finish()
        }

    }

}   
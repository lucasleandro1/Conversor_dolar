package com.example.conversordemoedas

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.conversordemoedas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit  var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            var dolar: Double = binding.editText.text.toString().toDouble()
            var reais = String.format("%.2f", dolar * 4.96)

            binding.textView.text = reais
        }
    }
}
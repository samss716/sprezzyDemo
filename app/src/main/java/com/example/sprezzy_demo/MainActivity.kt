package com.example.sprezzy_demo

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sprezzy_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.button6.setOnClickListener{
            binding.cafeimg.setImageResource(R.drawable.cafemenu)
        }

        binding.button7.setOnClickListener{
            binding.cafeimg.setImageResource(R.drawable.coffeer2)
        }

        binding.button8.setOnClickListener{
            binding.cafeimg.setImageResource(R.drawable.matchar1)
        }
    }

    private fun displayImageResource(resID: Int) {
        binding.cafeimg.setImageResource(resID)
    }
}
package com.example.basicpractice

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.basicpractice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            val nameEd = binding.nameEd.text.toString().trim()
            val fatherEd = binding.fatherEd.text.toString().trim()
            val mobileEd = binding.mobileEd.text.toString().trim()

            if (nameEd.isEmpty() || fatherEd.isEmpty() || mobileEd.isEmpty()) {
                Toast.makeText(this, "Fill all text", Toast.LENGTH_SHORT).show()
            }

            if (mobileEd.length != 10) {

                Toast.makeText(this, "Your number is invalid", Toast.LENGTH_SHORT).show()

            } else {
                binding.name.text = nameEd
                binding.father.text = fatherEd
                binding.mobile.text = mobileEd
            }
        }

    }
}
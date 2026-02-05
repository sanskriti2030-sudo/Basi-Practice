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
            var nameEd = binding.nameEd.text.toString()
            var fatherEd = binding.fatherEd.text.toString()
            var mobileEd = binding.mobileEd.text.toString()

            if (nameEd.isEmpty()) {
                Toast.makeText(this, "Name is required", Toast.LENGTH_SHORT).show()
            } else {
                binding.name.text = nameEd
            }
            if (fatherEd.isEmpty()) {
                Toast.makeText(this, "Father's Name is required", Toast.LENGTH_SHORT).show()
            } else {
                binding.father.text = fatherEd
            }
            if (mobileEd.isEmpty()) {
                Toast.makeText(this, "Mobile No. is required", Toast.LENGTH_SHORT).show()
            } else {
                binding.mobile.text = mobileEd
            }


        }

    }
}

























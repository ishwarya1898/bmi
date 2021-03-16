package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bmicalculator.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity(),Hhandle {
    lateinit var binding:ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hhandle=this
    }

    override fun save(view: View) {
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
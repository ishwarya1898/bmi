package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.bmicalculator.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(),Handle {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.handle=this
    }


    override fun onadd(view: View) {
        Toast.makeText(this,"MALE",Toast.LENGTH_SHORT).show()

    }

    override fun onaddd(view: View) {
        Toast.makeText(this,"FEMALE",Toast.LENGTH_SHORT).show()
    }

    override fun fabclicked(view: View) {
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)

    }

}
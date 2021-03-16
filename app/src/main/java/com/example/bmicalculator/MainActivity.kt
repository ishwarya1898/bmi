package com.example.bmicalculator

import android.content.Intent
import android.content.pm.ApplicationInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Handler {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.handler = this

    }


    override fun onAddClicked(view: View) {
        val h = (binding.height.text).toString().toFloat() / 100
        val w = binding.weight.text.toString().toFloat()
        val res = w / (h * h)
        binding.result.text = "%.2f".format(res)
        if (res >= 30) {
            binding.result.text = "BMI " + (res) + " = OBESE"
        } else if (res >= 25) {
            binding.result.text = "BMI " + (res) + " = OVERWEIGHT"
        } else if (res >= 18) {
            binding.result.text = "BMI " + (res) + " = NORMAL WEIGHT"
        } else {
            binding.result.text = "BMI " + (res) + " = UNDERWEIGHT"
        }
        val f=(1.20*res)+(binding.age.text.toString().toInt()*0.23)-16.2
        binding.fat.text="BODY FAT"+(f)




    }

    override fun npew(view: View) {
     binding.nnew.visibility=View.GONE
        binding.healthy.visibility=View.VISIBLE
    }





    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.settings, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.tit -> {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
                return true
            }
        }
        when (item.itemId) {
            R.id.about -> {
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)
                return true
            }
        }

        if(item.itemId==R.id.share) {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "BMI CALCULATOR")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
            return true

            }
        return super.onOptionsItemSelected(item)

        }



        }





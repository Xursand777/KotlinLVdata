package com.x7.kotlinlvdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import com.x7.kotlinlvdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var name=""
    var livedata=MutableLiveData<ArrayList<Int>>()
    var arraylist=ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button1.setOnClickListener {
            arraylist.add(7)
            livedata.value=arraylist
        }

        livedata.observe(this,{
            binding.textview1.text=it.size.toString()
        })






    }
}
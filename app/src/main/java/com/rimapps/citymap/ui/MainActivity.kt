package com.rimapps.citymap.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.rimapps.citymap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.loadCities()
        viewModel.viewState.observe(this){
            
            it.forEach { it ->
                mainBinding.tvCity.append(
                    "${it.country} ${it.capital}\n\n"
                )
            }
        }


    }
}
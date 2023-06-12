package com.example.mobilprojeodev

import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.mobilprojeodev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInsteanceState: Bundle?) {
        super.onCreate(savedInsteanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.setOnClickListener {
            if (binding.edittextnumber1.text.isNotEmpty()&&binding.edittextnumber2.text.isNotEmpty()) {
                var sinav1 = binding.edittextnumber1.text.toString().toInt()
                var sinav2 = binding.edittextnumber2.text.toString().toInt()
                var ortalama:Double = (sinav1 * 0.40)+(sinav2 * 0.60).toDouble()
                if (ortalama>=45 && sinav2>=50){
                    binding.sonuc.text = ortalama.toString()+" "+"Geçtiniz"
                    }else{
                    binding.sonuc.text = ortalama.toString()+" "+"Kaldınız" }

            }else{
                binding.sonuc.text = "Sınav notunuzu giriniz"
            }
        }
    }
}
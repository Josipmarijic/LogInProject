package com.example.loginproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginproject.databinding.ActivityMainBinding
import com.example.loginproject.databinding.ActivityUserPageBinding

class UserPage : AppCompatActivity() {
    //Samma som på föregående sida
    private lateinit var binding: ActivityUserPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //En tillbaka knapp
        binding.backBtn.setOnClickListener{
            val intent = Intent(this@UserPage, MainActivity::class.java)
            startActivity(intent)
        }

        //Gör inget med datan man fyller i så man får bara tillbaka det här meddelandet när man trycker på send
        binding.sendInput.setOnClickListener{
            Toast.makeText(applicationContext,"This button dosent actually do anything",Toast.LENGTH_SHORT).show()
        }


    }
}
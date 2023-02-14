package com.example.loginproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Använder viewBind istället för att hålla på med FindViewById
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Instansierar min binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userAcc = "josip"
        val userPass = "josip"





        //När man klickar logga in så jämför den inputsen med det jag har hårdkodat här
        binding.logInBtn.setOnClickListener {
            val inputAcc = binding.accName.text.toString()
            val inputPass = binding.password.text.toString()

            if (userAcc == inputAcc && userPass == inputPass) {
                //Bytar till nästa activity
                val intent = Intent(this@MainActivity, UserPage::class.java)
                startActivity(intent)
            }else{
                //Om fel så får man upp det här meddelandet
                Toast.makeText(applicationContext,"Wrong account or password",Toast.LENGTH_SHORT).show()
            }

        }
    }
}
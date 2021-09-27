package com.example.lab
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
lateinit var name: EditText
lateinit var location:EditText
lateinit var mobile:EditText
lateinit var button1:Button
lateinit var button2:Button
lateinit var btnMessage:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name=findViewById(R.id.name)
        location=findViewById(R.id.location)
        mobile=findViewById(R.id.mobile)
        button1=findViewById(R.id.button1)
        button2= findViewById(R.id.button2)
        btnMessage = findViewById(R.id.btnMessage)

        val list= listOf(name,location,mobile)

        button1.setOnClickListener{
            Toast.makeText(applicationContext,list.shuffled().take(1).toString(),Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener{
            button2.text =list.shuffled().take(1).toString()
        }


    }

}
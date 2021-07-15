package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class ContactDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        var intent=intent
        var image= intent.getStringExtra("image").toString()
        var name=intent.getStringExtra("name")
        var number=intent.getStringExtra("phone")
        var email=intent.getStringExtra("email")
        

        var tvName1=findViewById<TextView>(R.id.tvName1)
        var tvEmail1=findViewById<TextView>(R.id.tvEmail1)
        var tvPhone=findViewById<TextView>(R.id.tvPhone1)
        var imgContact1=findViewById<ImageView>(R.id.imgContact1)
        tvName1.text=name
        tvPhone.text=number
        tvEmail1.text=email
        Picasso.get().load(image).into(imgContact1)

    }
}
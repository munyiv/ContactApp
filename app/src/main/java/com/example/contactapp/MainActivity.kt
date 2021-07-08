package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contactDisplay()
    }
   fun contactDisplay(){
       var contactsList= listOf<Contacts>(
           Contacts("Audrey","0795860190","audreymunyiva@gmail.com"),
           Contacts("Munyiva","0795860190","munyiva@gmail.com"),
           Contacts("Kariuki","0795860190","kariuki@gmail.com"),
           Contacts("Patrick","0795860190","patrick@gmail.com"),
           Contacts("Mutiba","0795860190","mutiba@gmail.com"),
           Contacts("Ryan","0795860190","ryan@gmail.com"),
           Contacts("Olga","0795860190","olga@gmail.com"),
           Contacts("Brian","0795860190","brian@gmail.com"),
           Contacts("Njeri","0795860190","njeri@gmail.com"),
           Contacts("Kamau","0795860190","kamau@gmail.com"),
           Contacts("John","0795860190","john@gmail.com"),
           Contacts("Kinyanjui","0795860190","kinyanjui@gmail.com"),
           Contacts("Musembi","0795860190","musembi@gmail.com"),
           Contacts("Kativo","0795860190","kativo@gmail.com")
       )
       rvContacts=findViewById(R.id.rvContacts)
       var contactsAdapter=ContactRvAdapter(contactsList)
       rvContacts.layoutManager=LinearLayoutManager(baseContext)
       rvContacts.adapter=contactsAdapter

   }
}
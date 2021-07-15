package com.example.contactapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class ContactRvAdapter (var contactList: List<Contacts>,var context:Context):RecyclerView.Adapter<ContactViewHolder>(){
//    lateinit var cvContact:CardView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var itemView=LayoutInflater.from(parent.context)
           .inflate(R.layout.contact_list,parent,false)
        return ContactViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentNames=contactList.get(position)
        holder.tvPhone.text=currentNames.phone
        holder.tvName.text=currentNames.name
        holder.tvEmail.text=currentNames.email
        Picasso.get()
            .load(currentNames.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.imgContact)

        holder.cvContact.setOnClickListener {
            var intent=Intent(context,ContactDetailsActivity::class.java)
            intent.putExtra("name",currentNames.name)
            intent.putExtra("email",currentNames.email)
            intent.putExtra("phone",currentNames.phone)
            intent.putExtra("image",currentNames.imageUrl)

            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }
//        var intent = Intent(context, Wakeup::class.java)
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        holder.imgContact.setOnClickListener {
           Toast.makeText(context,"You have Clicked on my face",Toast.LENGTH_LONG).show()
        }


    }

    override fun getItemCount(): Int {
       return contactList.size
    }
}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvPhone=itemView.findViewById<TextView>(R.id.tvPhone)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var imgContact=itemView.findViewById<ImageView>(R.id.imgContact)
    var cvContact=itemView.findViewById<CardView>(R.id.cvContact)

}
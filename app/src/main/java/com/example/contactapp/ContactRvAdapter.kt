package com.example.contactapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactRvAdapter (var contactList: List<Contacts>):RecyclerView.Adapter<ContactViewHolder>(){
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

    }

    override fun getItemCount(): Int {
       return contactList.size
    }
}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvPhone=itemView.findViewById<TextView>(R.id.tvPhone)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)

}
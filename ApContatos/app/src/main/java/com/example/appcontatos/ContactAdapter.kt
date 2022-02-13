package com.example.appcontatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//classe que cria uma adaptação para o contato

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>() {

    private val list: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactAdapter.ContactAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])  // retorna posição da lista
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun update_list(list: List<Contact>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }


    class ContactAdapterViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){

        private val tvName: TextView = itemview.findViewById(R.id.text_view_name)
        private val tvPhone: TextView = itemview.findViewById(R.id.text_view_phone)


        fun bind(contact: Contact){
            tvName.text = contact.name
            tvPhone.text = contact.phone

        }
    }
}
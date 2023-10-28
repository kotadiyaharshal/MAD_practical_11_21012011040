package com.example.mad_practical_11_21012011040


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PersonAdapter( val context: Context,val personArray:ArrayList<Person>):RecyclerView.Adapter<PersonAdapter.PersionViewHolder>()
{
    inner class PersionViewHolder(val view: View):RecyclerView.ViewHolder(view)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersionViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.person_item,parent,false)
        return PersionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return personArray.size
    }

    override fun onBindViewHolder(holder: PersionViewHolder, position: Int) {
        val view=holder.view
        val contact = personArray.get(position) // Access the Contact object from the adapter
        view.findViewById<TextView>(R.id.textName1).text = contact?.name
        view.findViewById<TextView>(R.id.text_no).text = contact?.phoneNo
        view.findViewById<TextView>(R.id.textemail).text = contact?.emailId
        view.findViewById<TextView>(R.id.textaddress).text = contact?.address
        val button1: Button = view.findViewById(R.id.location)

        button1.setOnClickListener {
            // Start the MapsActivity when button1 is clicked
            val intent = Intent(context, MapsActivity::class.java)
            context.startActivity(intent)
        }

    }




}
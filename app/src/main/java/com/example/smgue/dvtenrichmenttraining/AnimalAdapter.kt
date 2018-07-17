package com.example.smgue.dvtenrichmenttraining


import android.support.constraint.R.id.parent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.view.*


/*Animal Adapter class */
class AnimalAdapter(val items: List<String>) : RecyclerView.Adapter<AnimalViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): AnimalViewHolder {
        return AnimalViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false))
    }

    /*Tells the recycle the number of items that will be in it*/
    override fun getItemCount(): Int = items.size

    /*Binds each animal in the ArrayList to a view*/
    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.textView.text = items.get(position)
    }

}

/*****************************************************************************************************************/

/*Animal viewHolder class*/
class AnimalViewHolder(view : View) : RecyclerView.ViewHolder(view){
    /*Holds the textView that will add each animal to*/
    val textView = view.textViewKotlin
}
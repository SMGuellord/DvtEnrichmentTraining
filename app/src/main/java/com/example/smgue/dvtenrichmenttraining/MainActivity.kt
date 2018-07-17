package com.example.smgue.dvtenrichmenttraining

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager


import kotlinx.android.synthetic.main.recycle_view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycle_view)

        /*Setup recycleView manager*/
        setupRecycleView()

        val animals = listOf("Lion", "Rabbit", "Leopard", "Eagle")

        /*Add AnimalAdapter to recycleView*/
        myRecycleView.adapter = AnimalAdapter(animals)
    }

    private fun setupRecycleView(){
        myRecycleView.layoutManager = LinearLayoutManager(this)
//        myRecycleView.layoutManager = LinearLayoutManager(GridLayoutManager, )
    }
}


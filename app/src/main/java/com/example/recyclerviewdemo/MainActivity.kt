package com.example.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitsList=listOf<Fruit>(
       Fruit("Mango","Joe"),
       Fruit ("Apple","Raj"),
       Fruit ("Strawberry","Bhoi"),
       Fruit ("Banana","Tej"),
       Fruit ("Guava","BBV"),
       Fruit ("Pear","Tirth"),
       Fruit ("Lemon","Viraj")

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=MyRecyclerViewAdapter(fruitsList) {
                selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }
    }
    private fun listItemClicked(fruit: Fruit){

            Toast.makeText(
                this@MainActivity,
                "The selected supplier is : ${fruit.supplier}",
                Toast.LENGTH_LONG).show()


    }
}
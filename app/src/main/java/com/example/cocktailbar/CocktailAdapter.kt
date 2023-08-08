package com.example.cocktailbar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonDisposableHandle.parent

class CocktailAdapter(val context : Context){
    fun drawOne(one : Cocktail) : TextView {
        val tv = TextView(context)

        val layoutParams = LinearLayout.LayoutParams(
            180, // CardView width
            180 // CardView height
        )

        // Set margins for card view
        layoutParams.setMargins(10, 10, 10, 10)

        // Set the card view layout params
        tv.layoutParams = layoutParams

        tv.setOnClickListener{
            Toast.makeText(
                context,
                "Card clicked.",
                Toast.LENGTH_SHORT).show()
        }
        val params = LinearLayout.LayoutParams(180, 180)

        tv.text = one.toString()

        return tv
    }

}
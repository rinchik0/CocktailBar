package com.example.cocktailbar

class Cocktail(var name : String,
               var description : String,
               var recipe : String
              // var ingredients : String
    ) {
    //var pictureName : String

    override fun toString(): String {
        return name + "" + description
    }
}
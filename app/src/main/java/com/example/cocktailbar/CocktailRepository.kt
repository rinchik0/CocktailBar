package com.example.cocktailbar

class CocktailRepository {
    private var list = mutableListOf<Cocktail>()

    fun getAll() : MutableList<Cocktail> {
        return list
    }

    fun add(new : Cocktail){
        list.add(new)
    }
}
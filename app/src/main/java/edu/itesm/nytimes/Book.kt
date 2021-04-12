package edu.itesm.nytimes



data class Results(val book: Book
)

/*
data class Books(
 //Completa aquí
)
*/

data class Book(val rank: Int,
                val title: String,
                val description: String,
                val book_image: String)


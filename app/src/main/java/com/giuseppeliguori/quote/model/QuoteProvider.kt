package com.giuseppeliguori.quote.model

/**
 * Created by giuseppeliguori on 06/03/2018.
 */

class QuoteProvider {

    fun getQuote(): Quote {
        return Quote("Imagination is more important than knowledge.", "Albert Einstein")
    }
}
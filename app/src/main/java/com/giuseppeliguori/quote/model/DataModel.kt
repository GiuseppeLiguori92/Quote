package com.giuseppeliguori.quote.model

import android.support.annotation.VisibleForTesting

/**
 * Created by giuseppeliguori on 02/03/2018.
 */
class DataModel {

    var quoteProvider = QuoteProvider()

    init {
        println("This ($this) is a singleton")
    }

    @VisibleForTesting
    fun getQuote(): Quote {
        return quoteProvider.getQuote()
    }
}
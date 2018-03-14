package com.giuseppeliguori.quote.model

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by giuseppeliguori on 14/03/2018.
 */
class QuoteProviderTest {
    @Test
    fun getQuote() {
        val quoteProvider = QuoteProvider()
        var phrase = quoteProvider.getQuote().phrase
        assertTrue("Imagination is more important than knowledge.".equals(phrase))
    }
}
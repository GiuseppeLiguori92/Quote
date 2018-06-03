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
        val phrase = quoteProvider.getQuote().phrase
        assertEquals("Imagination is more important than knowledge.", phrase)
    }
}
package com.giuseppeliguori.quote.model

import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito.*

/**
 * Created by giuseppeliguori on 14/03/2018.
 */
class DataModelTest {
    @Test
    fun getQuote() {
        val dataModel = spy(DataModel())
        val fakeQuote: Quote = mock(Quote::class.java)

        `when`(dataModel.getQuote()).thenReturn(fakeQuote)
        val quote = dataModel.getQuote()

        assertEquals(fakeQuote, quote)
    }

}
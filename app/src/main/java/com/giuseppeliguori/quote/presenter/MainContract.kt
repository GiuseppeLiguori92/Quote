package com.giuseppeliguori.quote.presenter

import com.giuseppeliguori.quote.model.Quote

/**
 * Created by giuseppeliguori on 02/03/2018.
 */
interface MainContract {
    interface View {
        fun initialiseView()
        fun showQuote(quote: Quote)
        fun setShareButtonEvent(quote: Quote)
    }

    interface Presenter {
        fun onViewCreated()
        fun getQuote()
    }
}
package com.giuseppeliguori.quote.presenter

/**
 * Created by giuseppeliguori on 02/03/2018.
 */
interface MainContract {
    interface View {
        fun initialiseView()
    }

    interface Presenter {
        fun onViewCreated()
    }
}
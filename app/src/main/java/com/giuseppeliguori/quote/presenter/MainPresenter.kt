package com.giuseppeliguori.quote.presenter

import android.annotation.SuppressLint
import android.support.annotation.NonNull
import com.giuseppeliguori.quote.model.DataModel
import com.giuseppeliguori.quote.model.Quote
import com.giuseppeliguori.quote.presenter.MainContract.Presenter

/**
 * Created by giuseppeliguori on 02/03/2018.
 */
class MainPresenter(val view: MainContract.View, private val dataModel: DataModel) : Presenter {

    override fun onViewCreated() {
        view.initialiseView()
    }

    @SuppressLint("VisibleForTests")
    override fun getQuote() {
        val quote: Quote = dataModel.getQuote()
        view.showQuote(quote)
        view.setShareButtonEvent(quote)
    }
}

package com.giuseppeliguori.quote.presenter

import com.giuseppeliguori.quote.model.DataModel
import com.giuseppeliguori.quote.model.Quote
import com.giuseppeliguori.quote.presenter.MainContract.Presenter

/**
 * Created by giuseppeliguori on 02/03/2018.
 */
class MainPresenter(view: MainContract.View, dataModel: DataModel) : Presenter {

    var view: MainContract.View? = null
    var dataModel: DataModel

    init {
        this.view = view
        this.dataModel = dataModel
    }

    override fun onViewCreated() {
        view?.initialiseView()
    }

    override fun getQuote() {
        val quote: Quote = dataModel.getQuote()
        view?.showQuote(quote)
        view?.setShareButtonEvent(quote)
    }
}

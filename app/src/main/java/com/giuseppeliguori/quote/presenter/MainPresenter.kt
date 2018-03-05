package com.giuseppeliguori.quote.presenter

import com.giuseppeliguori.quote.presenter.MainContract.Presenter

/**
 * Created by giuseppeliguori on 02/03/2018.
 */
class MainPresenter(view: MainContract.View) : Presenter {

    var view: MainContract.View? = null

    init {
        this.view = view
    }

    override fun onViewCreated() {
        view?.initialiseView()
    }
}
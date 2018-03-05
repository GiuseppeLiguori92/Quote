package com.giuseppeliguori.quote.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.giuseppeliguori.quote.R
import com.giuseppeliguori.quote.presenter.MainContract
import com.giuseppeliguori.quote.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.View {

    val TAG: String = "MainActivity"

    val mainPresenter: MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter.onViewCreated()

    }

    override fun initialiseView() {
        Log.d(TAG, "initialiseView")
    }
}

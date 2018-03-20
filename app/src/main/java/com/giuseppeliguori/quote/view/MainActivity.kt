package com.giuseppeliguori.quote.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ImageButton
import android.widget.TextView
import com.giuseppeliguori.quote.R
import com.giuseppeliguori.quote.Utils
import com.giuseppeliguori.quote.model.DataModel
import com.giuseppeliguori.quote.model.Quote
import com.giuseppeliguori.quote.presenter.MainContract
import com.giuseppeliguori.quote.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.View {
    var tvPhrase: TextView? = null
    var tvAuthor: TextView? = null
    var imgBtnShare: ImageButton? = null

    val TAG: String = "MainActivity"

    val mainPresenter: MainPresenter = MainPresenter(this, DataModel())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter.onViewCreated()

        mainPresenter.getQuote()
    }

    override fun initialiseView() {
        Log.d(TAG, "initialiseView")
        tvPhrase = findViewById(R.id.phrase)
        tvAuthor = findViewById(R.id.author)
        imgBtnShare = findViewById(R.id.share)
    }

    override fun showQuote(quote: Quote) {
        tvPhrase?.setText(quote.phrase)
        tvAuthor?.setText(quote.author)
    }

    override fun setShareButtonEvent(quote: Quote) {
        imgBtnShare?.setOnClickListener({
            startActivity(Utils().getShareIntent(quote))
        })
    }
}

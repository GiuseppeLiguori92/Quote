package com.giuseppeliguori.quote

import android.content.Intent
import com.giuseppeliguori.quote.model.Quote

/**
 * Created by giuseppeliguori on 20/03/2018.
 */

class Utils {
    fun getShareIntent(quote: Quote): Intent {
        var shareIntent = Intent()
        shareIntent.setAction(Intent.ACTION_SEND)
        shareIntent.putExtra(Intent.EXTRA_TEXT, quote.phrase + " " + quote.author);
        shareIntent.setType("text/plain")
        return shareIntent
    }
}
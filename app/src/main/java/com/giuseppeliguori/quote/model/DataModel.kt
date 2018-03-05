package com.giuseppeliguori.quote.model

/**
 * Created by giuseppeliguori on 02/03/2018.
 */
class DataModel private constructor() {

    init {
        println("This ($this) is a singleton")
    }

    private object Holder {
        val instance = DataModel()
    }

    companion object {
        val instance: DataModel by lazy { Holder.instance }
    }

    var b: String? = null
}
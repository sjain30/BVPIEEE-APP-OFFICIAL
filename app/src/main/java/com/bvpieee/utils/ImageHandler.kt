package com.bvpieee.utils

import android.content.Context
import com.squareup.picasso.Picasso
import java.util.concurrent.Executors


class ImageHandler {
    private var instance: Picasso? = null
    fun getSharedInstance(context: Context): Picasso? {
        return if (instance == null) {
            instance = Picasso.Builder(context).executor(Executors.newSingleThreadExecutor())
                .indicatorsEnabled(true).build()
            instance
        } else {
            instance
        }
    }
}
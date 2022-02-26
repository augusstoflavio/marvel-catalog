package com.marvelcatalog.commons.extensions

import android.content.Context
import android.util.Log
import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.loadImage(context: Context, url: String) {
    val builder = Picasso.Builder(context)
    builder.listener { picasso, uri, exception ->
        Log.e("Picasso error", url + " " + exception.message)
    }
    builder.build().load(url).resize(120, 120).into(this)
}
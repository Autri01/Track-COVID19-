package com.example.trackercovid

import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan

class SpanableDelta(text:String, langColor: String, start:Int):SpannableString(text){
    init {
        setSpan(
                ForegroundColorSpan(Color.parseColor(langColor)),
                start,
                text.length ,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
}
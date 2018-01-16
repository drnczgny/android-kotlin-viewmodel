package com.adrian.project.ui.other.model

import android.util.Log

/**
 * Created by cadri on 2018. 01. 16..
 */

class OtherModel {

    companion object {
        private val TAG = OtherModel.javaClass.simpleName.toString()
    }

    fun print() {
        Log.e(TAG,"print from other model ...............");
    }
}
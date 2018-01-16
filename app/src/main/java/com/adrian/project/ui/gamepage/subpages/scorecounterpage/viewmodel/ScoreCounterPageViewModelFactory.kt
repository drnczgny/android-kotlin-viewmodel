package com.adrian.project.ui.gamepage.subpages.scorecounterpage.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.adrian.project.MyApplication
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.model.ScoreCounterPageModel

/**
 * Created by cadri on 2018. 01. 16..
 */

class ScoreCounterPageViewModelFactory
constructor(val myApplication: MyApplication, val scoreCounterPageModel: ScoreCounterPageModel) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreCounterPageViewModel::class.java!!)) {
            return ScoreCounterPageViewModel(myApplication, scoreCounterPageModel) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
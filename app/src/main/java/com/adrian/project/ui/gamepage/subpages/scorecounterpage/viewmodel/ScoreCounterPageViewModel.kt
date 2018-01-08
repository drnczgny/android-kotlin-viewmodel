package com.adrian.project.ui.gamepage.subpages.scorecounterpage.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.adrian.project.MyApplication
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.model.ScoreCounterPageModel

/**
 * Created by cadri on 2017. 12. 25..
 */

class ScoreCounterPageViewModel constructor(myApplication: Application) : AndroidViewModel(myApplication) {

    constructor(myApplication: MyApplication, scoreCounterPageModel: ScoreCounterPageModel): this(myApplication)

    var scorePlayerA: MutableLiveData<Int>

    var scorePlayerB: MutableLiveData<Int>

    init {
        scorePlayerA = MutableLiveData<Int>()
        scorePlayerA.value = 0;
        scorePlayerB = MutableLiveData<Int>()
        scorePlayerB.value = 0;
    }

    fun addPointForA(score: Int) {
        scorePlayerA.value = scorePlayerA.value?.plus(score)
    }

    fun addPointForB(score: Int) {
        scorePlayerB.value = scorePlayerB.value?.plus(score)
    }
}
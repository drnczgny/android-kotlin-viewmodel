package com.adrian.project.ui.gamepage.subpages.scorecounterpage.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel

/**
 * Created by cadri on 2017. 12. 25..
 */

class ScoreCounterPageViewModel(application: Application) : AndroidViewModel(application) {

    var scorePlayerA: Int = 0

    var scorePlayerB: Int = 0

}
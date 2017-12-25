package com.adrian.project.ui.gamepage.subpages.scorecounterpage

import com.adrian.project.data.ApiService

/**
 * Created by cadri on 2017. 08. 05..
 */

class GamePageModel constructor(val apiService: ApiService){

    fun callApiService() = apiService.fakeApiCall()

}
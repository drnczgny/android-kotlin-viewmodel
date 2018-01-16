package com.adrian.project.ui.gamepage.di

import com.adrian.kotlinrecyclerviewdagger.main.di.ActivityScope
import com.adrian.project.data.ApiService
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.GamePageModel
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.GamePageRouter
import com.adrian.project.ui.main.GamePageActivity
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 08. 05..
 */

@Module
class GamePageModule {

    @ActivityScope
    @Provides
    fun providesGamePageRouter(gamePageActivity: GamePageActivity): GamePageRouter = gamePageActivity

    @ActivityScope
    @Provides
    fun providesGamePageModel(apiService: ApiService) = GamePageModel(apiService)

}
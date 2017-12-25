package com.adrian.project.ui.gamepage.di

import com.adrian.project.data.ApiService
import com.adrian.project.ui.main.GamePageActivity
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.GamePageModel
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.GamePageRouter
import com.adrian.kotlinrecyclerviewdagger.main.di.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 08. 05..
 */

@Module
class GamePageModule {

    @ActivityScope
    @Provides
    fun providesJsonPlaceholderRouter(gamePageActivity: GamePageActivity): GamePageRouter = gamePageActivity

    @ActivityScope
    @Provides
    fun providesJsonPlaceholderModel(apiService: ApiService) = GamePageModel(apiService)

}
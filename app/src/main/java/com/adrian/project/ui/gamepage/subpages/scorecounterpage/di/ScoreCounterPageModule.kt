package com.adrian.project.ui.gamepage.subpages.scorecounterpage.di

import com.adrian.project.data.ApiService
import com.adrian.project.scope.FragmentScope
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.view.ScoreCounterPageFragment
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.model.ScoreCounterPageModel
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.view.ScoreCounterPageRouter
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 08. 05..
 */

@Module
class ScoreCounterPageModule {

    @FragmentScope
    @Provides
    fun providesPostsPageRouter(postsPageFragment: ScoreCounterPageFragment): ScoreCounterPageRouter = postsPageFragment

    @FragmentScope
    @Provides
    fun providesPostsPageModel(apiService: ApiService) = ScoreCounterPageModel(apiService)

}
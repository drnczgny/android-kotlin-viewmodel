package com.adrian.project.ui.gamepage.subpages.scorecounterpage.di

import com.adrian.project.MyApplication
import com.adrian.project.data.ApiService
import com.adrian.project.scope.FragmentScope
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.model.ScoreCounterPageModel
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.view.ScoreCounterPageFragment
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.view.ScoreCounterPageRouter
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.viewmodel.ScoreCounterPageViewModelFactory
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2017. 08. 05..
 */

@Module
class ScoreCounterPageModule {

    @FragmentScope
    @Provides
    fun providesScorePagePageRouter(scoreCounterPageFragment: ScoreCounterPageFragment): ScoreCounterPageRouter = scoreCounterPageFragment

    @FragmentScope
    @Provides
    fun providesScorePagePageModel(apiService: ApiService) = ScoreCounterPageModel(apiService)

//    @FragmentScope
//    @Provides
//    fun providesScorePageViewModel(myApplication: MyApplication,
//                                   scoreCounterPageFragment: ScoreCounterPageFragment,
//                                   scoreCounterPageModel: ScoreCounterPageModel): ScoreCounterPageViewModel {
//        return ViewModelProviders.of(scoreCounterPageFragment).get(ScoreCounterPageViewModel::class.java)
//    }

    @Provides
    fun provideScorePageViewModelFactory(myApplication: MyApplication, scoreCounterPageModel: ScoreCounterPageModel): ScoreCounterPageViewModelFactory
        = ScoreCounterPageViewModelFactory(myApplication, scoreCounterPageModel)

}

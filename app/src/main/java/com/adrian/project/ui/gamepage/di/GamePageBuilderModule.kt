package com.adrian.project.ui.gamepage.di

import com.adrian.project.scope.FragmentScope
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.view.ScoreCounterPageFragment
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.di.ScoreCounterPageModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cadri on 2017. 08. 05..
 */

@Module
abstract class GamePageBuilderModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = arrayOf(ScoreCounterPageModule::class))
    abstract fun bindPostsPageFragment(): ScoreCounterPageFragment

}

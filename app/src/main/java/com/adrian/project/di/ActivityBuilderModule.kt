package com.adrian.project.di

import com.adrian.kotlinrecyclerviewdagger.main.di.ActivityScope
import com.adrian.project.ui.gamepage.di.GamePageBuilderModule
import com.adrian.project.ui.gamepage.di.GamePageModule
import com.adrian.project.ui.main.GamePageActivity
import com.adrian.project.ui.main.di.MainModule
import com.adrian.project.ui.main.view.MainActivity
import com.adrian.project.ui.other.di.OtherModule
import com.adrian.project.ui.other.view.OtherPageActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cadri on 2017. 08. 03..
 */

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
    abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(GamePageModule::class, GamePageBuilderModule::class))
    abstract fun bindGamePageActivity(): GamePageActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(OtherModule::class))
    abstract fun bindOtherPageActivity(): OtherPageActivity
}
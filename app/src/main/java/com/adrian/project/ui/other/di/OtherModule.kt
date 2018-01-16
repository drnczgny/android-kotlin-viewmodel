package com.adrian.project.ui.other.di

import com.adrian.kotlinrecyclerviewdagger.main.di.ActivityScope
import com.adrian.project.ui.other.model.OtherModel
import dagger.Module
import dagger.Provides

/**
 * Created by cadri on 2018. 01. 16..
 */

@Module
class OtherModule {

    @ActivityScope
    @Provides
    fun providesOtherModel() = OtherModel()
}
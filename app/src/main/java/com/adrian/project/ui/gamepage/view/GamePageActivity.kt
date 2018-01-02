package com.adrian.project.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.adrian.project.R
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.GamePageModel
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.GamePageRouter
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.view.ScoreCounterPageFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class GamePageActivity : AppCompatActivity(), GamePageRouter, HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var gamePageModel: GamePageModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        gamePageModel.callApiService()

        openPostsPageFragment(savedInstanceState)
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }

    fun openPostsPageFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null)
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.scoreCounterPageContainer, ScoreCounterPageFragment.newInstance())
                    .commitAllowingStateLoss()
    }
}

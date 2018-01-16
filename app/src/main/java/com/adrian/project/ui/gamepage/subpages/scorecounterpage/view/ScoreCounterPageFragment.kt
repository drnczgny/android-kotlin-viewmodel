package com.adrian.project.ui.gamepage.subpages.scorecounterpage.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adrian.project.R
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.viewmodel.ScoreCounterPageViewModel
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.viewmodel.ScoreCounterPageViewModelFactory
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_score_counter.*
import javax.inject.Inject


class ScoreCounterPageFragment : Fragment(), ScoreCounterPageRouter {

    @Inject
    lateinit var scoreCounterPageViewModelFactory: ScoreCounterPageViewModelFactory

    lateinit var scoreCounterPageViewModel: ScoreCounterPageViewModel

    companion object {
        fun newInstance(): ScoreCounterPageFragment {
            val fragment = ScoreCounterPageFragment()
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_score_counter, container, false)
        scoreCounterPageViewModel = ViewModelProviders.of(this, scoreCounterPageViewModelFactory).get(ScoreCounterPageViewModel::class.java!!)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupLiveDataObservers()
        setupButtonListeners()

        scoreCounterPageViewModel.fv()
    }

    private fun setupLiveDataObservers() {
        scoreCounterPageViewModel.scorePlayerA.observe(this, Observer {
            it.let { tvPlayerAScore.text = it.toString() }
        })

        scoreCounterPageViewModel.scorePlayerB.observe(this, Observer {
            it.let { tvPlayerBScore.text = it.toString() }
        })
    }

    private fun setupButtonListeners() {
        btnOnePointPlayerA.setOnClickListener() {
            scoreCounterPageViewModel.addPointForA(1)
        }
        btnTwoPointPlayerA.setOnClickListener() {
            scoreCounterPageViewModel.addPointForA(2)
        }
        btnOnePointPlayerB.setOnClickListener() {
            scoreCounterPageViewModel.addPointForB(1)
        }
        btnTwoPointPlayerB.setOnClickListener() {
            scoreCounterPageViewModel.addPointForB(2)
        }
    }
}

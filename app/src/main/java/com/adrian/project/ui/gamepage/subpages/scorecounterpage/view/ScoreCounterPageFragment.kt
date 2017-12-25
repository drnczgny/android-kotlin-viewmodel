package com.adrian.project.ui.gamepage.subpages.scorecounterpage.view

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adrian.project.R
import com.adrian.project.ui.gamepage.subpages.scorecounterpage.model.ScoreCounterPageModel
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject


class ScoreCounterPageFragment : Fragment(), ScoreCounterPageRouter {

    @Inject
    lateinit var scoreCounterPageModel: ScoreCounterPageModel

    companion object {
        fun newInstance(): ScoreCounterPageFragment {
            val fragment = ScoreCounterPageFragment()

            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AndroidSupportInjection.inject(this)

        if (arguments != null) {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        scoreCounterPageModel.callApiService()

        return inflater!!.inflate(R.layout.fragment_score_counter, container, false)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

}

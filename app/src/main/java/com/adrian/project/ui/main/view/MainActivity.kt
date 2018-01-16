package com.adrian.project.ui.main.view

import android.support.v7.app.AppCompatActivity
import com.adrian.project.R
import com.adrian.project.ui.main.GamePageActivity
import com.adrian.project.ui.main.model.MainModel
import com.adrian.project.ui.other.view.OtherPageActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainRouter {

    @Inject
    lateinit var mainModel: MainModel

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        dagger.android.AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        mainModel.callApiService()

        btnGamePage.setOnClickListener { openGamePage() }
        btnOtherPage.setOnClickListener { openOtherPage() }
    }

    fun openGamePage() {
        val intent = android.content.Intent(this, GamePageActivity::class.java)
        startActivity(intent)
    }

    fun openOtherPage() {
        val intent = android.content.Intent(this, OtherPageActivity::class.java)
        startActivity(intent)
    }
}

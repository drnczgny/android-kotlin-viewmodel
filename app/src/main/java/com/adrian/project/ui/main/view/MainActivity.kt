package com.adrian.project.ui.main.view

import android.support.v7.app.AppCompatActivity
import com.adrian.project.R
import com.adrian.project.ui.main.GamePageActivity
import com.adrian.project.ui.main.model.MainModel
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

        btnGamePage.setOnClickListener { openPostsPage() }
    }

    fun openPostsPage() {
        val intent = android.content.Intent(this, GamePageActivity::class.java)
        startActivity(intent)
    }

}

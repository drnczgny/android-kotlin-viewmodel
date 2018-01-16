package com.adrian.project.ui.other.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.adrian.project.R
import com.adrian.project.ui.other.model.OtherModel
import dagger.android.AndroidInjection
import javax.inject.Inject

class OtherPageActivity : AppCompatActivity() {

    @Inject
    lateinit var otherModel: OtherModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_other)

        otherModel.print()
    }
}

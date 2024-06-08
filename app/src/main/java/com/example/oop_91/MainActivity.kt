package com.example.oop_91

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), MainActivityContract.MainView {
    val presenter = MainActivityPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btOne).setOnClickListener { presenter.showFirstFragment() }
        findViewById<Button>(R.id.btTwo).setOnClickListener { presenter.showSecondFragment() }
        findViewById<Button>(R.id.btTree).setOnClickListener { presenter.showThirdFragment() }
    }
    override fun setFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.menuFragmentContainer, fragment)
            .commit()
    }
    override fun updateTopMenu(enumItem: Int) {
    }
}
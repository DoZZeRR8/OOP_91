package com.example.oop9

import com.example.oop9.fragments.FirstFragment
import com.example.oop9.fragments.SecondFragment
import com.example.oop9.fragments.ThirdFragment

class MainActivityPresenter(val mainView: MainActivityContract.MainView): MainActivityContract.Presenter {
    override fun getDbData() {
        TODO("Not yet implemented")
    }
    override fun getServerData() {
        TODO("Not yet implemented")
    }
    override fun showFirstFragment() {
        val fragment = FirstFragment.newInstance("f", "fff")
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }
    override fun showSecondFragment() {
        val fragment = SecondFragment.newInstance("f", "fff")
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }
    override fun showThirdFragment() {
        val fragment = ThirdFragment.newInstance("f", "fff")
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }
}
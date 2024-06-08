package com.example.oop_91

import androidx.fragment.app.Fragment

class MainActivityContract {
    interface MainView{
        fun setFragment(fragment: Fragment)
        fun updateTopMenu(enumItem: Int)
    }
    interface FirstFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface SecondFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface ThirdFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface Presenter{
        fun getDbData()
        fun getServerData()
        fun showFirstFragment()
        fun showSecondFragment()
        fun showThirdFragment()
    }
}
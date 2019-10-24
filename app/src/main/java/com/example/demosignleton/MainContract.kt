package com.example.demosignleton

interface MainContract {
    interface View {
       fun goToActivityBUI()
    }

    interface Presenter {
        fun gotoActivityB()
    }
}
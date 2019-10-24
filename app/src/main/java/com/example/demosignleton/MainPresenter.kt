package com.example.demosignleton

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    override fun gotoActivityB() {
        view.goToActivityBUI()
    }

    companion object {
        private var INSTANCE: MainPresenter? = null

        @JvmStatic
        fun getInstance(view: MainContract.View): MainPresenter {
            return INSTANCE ?: MainPresenter(view).apply {
                INSTANCE = this
            }
        }

        @JvmStatic
        fun destroyInstance(){
            INSTANCE = null
        }
    }
}
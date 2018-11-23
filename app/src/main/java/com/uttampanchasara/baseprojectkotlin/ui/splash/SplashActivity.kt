package com.uttampanchasara.baseprojectkotlin.ui.splash

import android.content.Intent
import com.uttampanchasara.baseprojectkotlin.R
import com.uttampanchasara.baseprojectkotlin.data.DataManager
import com.uttampanchasara.baseprojectkotlin.di.component.ActivityComponent
import com.uttampanchasara.baseprojectkotlin.ui.base.BaseActivity
import com.uttampanchasara.baseprojectkotlin.ui.signin.SignInActivity
import javax.inject.Inject

class SplashActivity : BaseActivity(), SplashView {
    override fun getLayout(): Int {
        return R.layout.activity_splash
    }

    @Inject
    lateinit var mDataManager: DataManager

    @Inject
    lateinit var mViewModel: SplashViewModel<SplashView>

    override fun injectComponents(mActivityComponent: ActivityComponent) {
        mActivityComponent.inject(this)
    }

    override fun setUp() {
        mViewModel.onAttachView(this)
        mViewModel.navigateToSignIn()
    }

    override fun navigateToSignIn() {
        startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }
}
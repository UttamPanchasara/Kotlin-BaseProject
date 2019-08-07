package com.uttampanchasara.baseprojectkotlin.ui.signin

import android.content.Intent
import android.view.View
import com.uttampanchasara.baseprojectkotlin.R
import com.uttampanchasara.baseprojectkotlin.di.component.ActivityComponent
import com.uttampanchasara.baseprojectkotlin.ui.base.BaseActivity
import com.uttampanchasara.baseprojectkotlin.ui.dashboard.DashboardActivity
import kotlinx.android.synthetic.main.activity_sign_in.*
import javax.inject.Inject

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 11/13/2018
 */
class SignInActivity : BaseActivity(), View.OnClickListener, SignInView {

    @field:Inject
    lateinit var mViewModel: SignInViewModel

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnLogin -> doLogin()
        }
    }

    override fun getLayout(): Int {
        return R.layout.activity_sign_in
    }

    override fun injectComponents(mActivityComponent: ActivityComponent) {
        mActivityComponent.inject(this)
    }

    override fun setUp() {
        mViewModel.onAttachView(this)

        bindViews()
    }

    private fun bindViews() {
        btnLogin.setOnClickListener(this)
    }

    private fun doLogin() {

        val email = edtEmail.text.toString()

        when {
            email.isEmpty() -> {
                onError("Enter non empty Email")
            }
            else -> {
                startActivity(Intent(this, DashboardActivity::class.java))
                finish()
            }
        }
    }
}
package com.uttampanchasara.baseprojectkotlin.ui.splash

import com.uttampanchasara.baseprojectkotlin.BaseViewModel
import com.uttampanchasara.baseprojectkotlin.data.DataManager
import com.uttampanchasara.baseprojectkotlin.ui.base.BaseView
import com.uttampanchasara.baseprojectkotlin.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 11/20/2018
 */
class SplashViewModel<V>
@Inject constructor(val mDataManager: DataManager,
                    val mSchedulerProvider: SchedulerProvider,
                    val mCompositeDisposable: CompositeDisposable) : BaseViewModel<V>() {

    var mView: SplashView? = null

    override fun onAttachView(v: BaseView) {
        super.onAttachView(v)
        mView = v as SplashView
    }

    override fun onDetachView() {
        super.onDetachView()
        mView = null
    }

    fun navigateToSignIn() {
        mView?.navigateToSignIn()
    }
}
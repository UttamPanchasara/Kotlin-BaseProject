package com.uttampanchasara.baseprojectkotlin.ui.signin

import com.uttampanchasara.baseprojectkotlin.BaseViewModel
import com.uttampanchasara.baseprojectkotlin.data.DataManager
import com.uttampanchasara.baseprojectkotlin.di.PerActivity
import com.uttampanchasara.baseprojectkotlin.ui.base.BaseView
import com.uttampanchasara.baseprojectkotlin.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 11/13/2018
 */
@PerActivity
class SignInViewModel<V>
@Inject constructor(val mDataManager: DataManager,
                    val mSchedulerProvider: SchedulerProvider,
                    val mCompositeDisposable: CompositeDisposable) : BaseViewModel<V>() {
    override fun onAttachView(v: BaseView) {

    }

    override fun onDetachView() {

    }
}
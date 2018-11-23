package com.uttampanchasara.baseprojectkotlin.ui.dashboard

import com.uttampanchasara.baseprojectkotlin.BaseViewModel
import com.uttampanchasara.baseprojectkotlin.data.DataManager
import com.uttampanchasara.baseprojectkotlin.ui.base.BaseView
import com.uttampanchasara.baseprojectkotlin.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 11/16/2018
 */
class DashboardViewModel<V> @Inject constructor(mDataManager: DataManager,
                                                mSchedulerProvider: SchedulerProvider,
                                                mCompositeDisposable: CompositeDisposable) : BaseViewModel<V>() {
    override fun onAttachView(v: BaseView) {

    }

    override fun onDetachView() {

    }

}
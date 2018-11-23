package com.uttampanchasara.baseprojectkotlin

import android.arch.lifecycle.ViewModel
import com.uttampanchasara.baseprojectkotlin.ui.base.BaseView

/**
 * Created by Bhavik Makwana on 10-09-2018.
 */
open class BaseViewModel<V> : ViewModel(), BaseView {
    override fun hideLoading() {
        // do nothing
    }

    override fun showLoading() {
        // do nothing
    }

    override fun onUnAuthorizedAccess() {
        // do nothing
    }

    var v: BaseView? = null

    override fun onAttachView(v: BaseView) {
        this.v = v
    }

    override fun onDetachView() {
        this.v = null
    }

    fun getView(): BaseView? {
        return v
    }
}
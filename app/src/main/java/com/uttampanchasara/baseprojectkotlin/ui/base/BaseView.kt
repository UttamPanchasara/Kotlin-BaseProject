package com.uttampanchasara.baseprojectkotlin.ui.base

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 11/20/2018
 */
interface BaseView {
    fun onAttachView(v: BaseView)
    fun onDetachView()

    fun hideLoading()

    fun showLoading()

    fun onUnAuthorizedAccess()

    fun onError(msg: String)

    fun onError(msg: Int)
}
package com.uttampanchasara.baseprojectkotlin

import android.app.Application
import com.uttampanchasara.baseprojectkotlin.data.DataManager
import com.uttampanchasara.baseprojectkotlin.di.component.DaggerAppComponent
import com.uttampanchasara.baseprojectkotlin.di.module.AppModule
import com.uttampanchasara.baseprojectkotlin.utils.PrefUtils
import javax.inject.Inject

class AppController : Application() {

    companion object {
        lateinit var mAppController: AppController
    }

    @set:Inject
    internal var mDataManager: DataManager? = null

    lateinit var mAppComponent: DaggerAppComponent

    override fun onCreate() {
        super.onCreate()
        PrefUtils.init(this)
        mAppController = this

        mAppComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build() as DaggerAppComponent

        mAppComponent.inject(this)
    }

    /*override fun attachBaseContext(context: Context) {
        super.attachBaseContext(context)
        MultiDex.install(this)
    }*/
}
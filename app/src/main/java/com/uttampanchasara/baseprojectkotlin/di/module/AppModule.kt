package com.uttampanchasara.baseprojectkotlin.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.uttampanchasara.baseprojectkotlin.AppConstants
import com.uttampanchasara.baseprojectkotlin.data.*
import com.uttampanchasara.baseprojectkotlin.data.network.ApiHeader
import com.uttampanchasara.baseprojectkotlin.data.network.ApiHelper
import com.uttampanchasara.baseprojectkotlin.data.network.AppApiHelper
import com.uttampanchasara.baseprojectkotlin.data.prefs.AppPreferencesHelper
import com.uttampanchasara.baseprojectkotlin.data.prefs.PreferencesHelper
import com.uttampanchasara.baseprojectkotlin.di.ApplicationContext
import com.uttampanchasara.baseprojectkotlin.di.PreferenceInfo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 11/15/2018
 */
@Module
class AppModule constructor(val mApplication: Application) {

    @Provides
    @ApplicationContext
    internal fun provideContext(): Context {
        return mApplication
    }

    @Provides
    internal fun provideApplication(): Application {
        return mApplication
    }

    @Provides
    @PreferenceInfo
    internal fun providePreferenceName(): String {
        return AppConstants.PREF_NAME
    }

    @Provides
    @Singleton
    internal fun providePreferencesHelper(appPreferencesHelper: AppPreferencesHelper): PreferencesHelper {
        return appPreferencesHelper
    }

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }

    @Provides
    @Singleton
    internal fun provideProtectedApiHeader(preferencesHelper: PreferencesHelper): ApiHeader.ProtectedApiHeader {
        return ApiHeader.ProtectedApiHeader(
                "",
                "")
    }

    @Provides
    @Singleton
    internal fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, AppConstants.APP_DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build()

    @Provides
    @Singleton
    internal fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }

    @Provides
    @Singleton
    internal fun provideDbHelper(appDbHelper: AppDbHelper): DbHelper {
        return appDbHelper
    }
}
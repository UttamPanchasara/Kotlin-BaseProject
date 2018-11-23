package com.uttampanchasara.baseprojectkotlin.data

import android.content.Context
import com.uttampanchasara.baseprojectkotlin.di.ApplicationContext
import com.uttampanchasara.network.remote.ApiServices
import com.uttampanchasara.network.response.RecipeResponse
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 11/15/2018
 */
@Singleton
class AppDataManager
@Inject internal constructor(@ApplicationContext val context: Context,
                             val dbHelper: DbHelper,
                             val apiServices: ApiServices) : DataManager {
    override fun getRecipes(query: String): Observable<RecipeResponse> {
        return apiServices.getRecipes(query)
    }
}
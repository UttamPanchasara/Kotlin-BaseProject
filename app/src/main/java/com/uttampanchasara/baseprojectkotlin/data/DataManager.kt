package com.uttampanchasara.baseprojectkotlin.data

import com.uttampanchasara.baseprojectkotlin.data.network.ApiHelper
import com.uttampanchasara.baseprojectkotlin.data.prefs.PreferencesHelper

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 11/15/2018
 */
interface DataManager : DbHelper, PreferencesHelper, ApiHelper {
}
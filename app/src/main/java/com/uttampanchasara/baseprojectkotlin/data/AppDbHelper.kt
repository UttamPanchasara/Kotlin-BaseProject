package com.uttampanchasara.baseprojectkotlin.data

import javax.inject.Inject

/**
 *
 * @author <a href="https://github.com/UttamPanchasara">Uttam Panchasara</a>
 * @since 11/15/2018
 */
class AppDbHelper @Inject internal constructor(private val appDatabase: AppDatabase) : DbHelper {

}
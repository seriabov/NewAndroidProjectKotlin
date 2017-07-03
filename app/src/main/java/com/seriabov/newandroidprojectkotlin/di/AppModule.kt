package com.seriabov.newandroidprojectkotlin.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Sergei Riabov
 */

@Module(includes = arrayOf(ViewModelModule::class))
class AppModule {

  @Singleton
  @Provides
  fun provideContext(app: Application): Context = app.applicationContext

  @Singleton
  @Provides
  fun provideSharedPreferences(context: Context): SharedPreferences {
    return PreferenceManager.getDefaultSharedPreferences(context)
  }

}
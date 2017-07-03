package com.seriabov.newandroidprojectkotlin.di


import android.app.Application
import com.seriabov.newandroidprojectkotlin.AppDelegate
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * @author Sergei Riabov
 */

@Singleton
@Component(modules = arrayOf(
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityInjectorModule::class))

interface AppComponent {

  @Component.Builder
  interface Builder {
    @BindsInstance
    fun application(application: Application): Builder

    fun build(): AppComponent
  }

  fun inject(appDelegate: AppDelegate)
}


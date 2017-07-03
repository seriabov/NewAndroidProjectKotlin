package com.seriabov.newandroidprojectkotlin.di

import com.seriabov.newandroidprojectkotlin.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityInjectorModule {
  @ContributesAndroidInjector(modules = arrayOf(FragmentBuildersModule::class))
  abstract fun contributeMainActivity(): MainActivity
}
package com.example.moviedb.catalog.di

import com.example.moviedb.catalog.ui.fragment.MovieCatalogFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMovieCatalogFragment(): MovieCatalogFragment
}
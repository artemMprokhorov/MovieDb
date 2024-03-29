package com.example.moviedb.commons.mvi

import io.reactivex.Observable

interface MviUi<TIntent, in TUiState> {

    fun userIntents(): Observable<TIntent>

    fun renderStates(uiState: TUiState)
}
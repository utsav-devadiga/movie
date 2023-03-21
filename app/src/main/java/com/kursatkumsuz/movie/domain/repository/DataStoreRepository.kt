package com.kursatkumsuz.movie.domain.repository

import kotlinx.coroutines.flow.Flow

interface DataStoreRepository {

    suspend fun saveOnBoardingState(isCompleted : Boolean)

    fun readOnBoardingState() : Flow<Boolean>
}
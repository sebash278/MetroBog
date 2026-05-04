package com.example.metrobog.data.repository

import androidx.room.Query
import com.example.metrobog.data.model.Route
import kotlinx.coroutines.flow.Flow

interface RouteRepository {
    fun getALlRoutes() : Flow<List<Route>>
    fun searchRoutes(query: String): Flow<List<Route>>
    suspend fun getRouteById(routeId: String): Route?
}
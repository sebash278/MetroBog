package com.example.metrobog.domain.usecase

import com.example.metrobog.data.model.Stop
import com.example.metrobog.data.repository.StopRepository

class GetNearbyStopsUseCase(private val stopRepository: StopRepository) {
    suspend operator fun invoke(lat: Double, lon: Double, radiuskm: Double = 0.5): List<Stop> =
        stopRepository.getNearbyStops(lat, lon, radiuskm)


}
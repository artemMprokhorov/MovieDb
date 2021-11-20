package com.example.moviedb.catalog.domain.model

data class DomainPopular(
    val page: Long,
    val totalResults: Long,
    val totalPages: Long,
    val results: List<DomainPopularItem>
)
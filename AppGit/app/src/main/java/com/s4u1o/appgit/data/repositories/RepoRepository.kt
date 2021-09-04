package com.s4u1o.appgit.data.repositories


import com.s4u1o.appgit.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}
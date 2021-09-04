package com.s4u1o.appgit.domain

import com.s4u1o.appgit.core.UseCase
import com.s4u1o.appgit.data.model.Repo
import com.s4u1o.appgit.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}
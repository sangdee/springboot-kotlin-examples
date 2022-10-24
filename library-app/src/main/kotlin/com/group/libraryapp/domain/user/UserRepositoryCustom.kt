package com.group.libraryapp.domain.user

interface UserRepositoryCustom {
    fun findWithHistories(): List<User>

}
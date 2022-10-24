package com.group.libraryapp.domain.user.loanhistory

import com.group.libraryapp.domain.book.Book
import org.springframework.data.jpa.repository.JpaRepository

interface UserLoanHistoryRepository : JpaRepository<UserLoanHistory, Long> {

}
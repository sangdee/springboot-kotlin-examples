package com.group.libraryapp.domain.user.loanhistory

import com.group.libraryapp.domain.user.User


data class UserLoanHistoryResponse(
    val name: String, //
    val books: List<BookHistoryResponse>
) {
    companion object {
        fun of(user: User): UserLoanHistoryResponse {
            return UserLoanHistoryResponse(
                name = user.name,
                books = user.userLoanHistories.map(BookHistoryResponse::of)
            )
        }
    }
}

data class BookHistoryResponse(
    val name: String, //
    val isReturn: Boolean
) {
    companion object {
        fun of(history: UserLoanHistory): BookHistoryResponse {
            return BookHistoryResponse(
                name = history.bookName,
                isReturn = history.isReturn
            )
        }
    }
}
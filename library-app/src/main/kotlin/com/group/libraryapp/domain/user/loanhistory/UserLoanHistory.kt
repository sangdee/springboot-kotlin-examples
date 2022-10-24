package com.group.libraryapp.domain.user.loanhistory

import com.group.libraryapp.domain.user.User
import javax.persistence.*

@Entity
class UserLoanHistory constructor(
    @ManyToOne
    val user: User,

    val bookName: String,

    @Enumerated(EnumType.STRING)
    var status: UserLoanStatus = UserLoanStatus.LOANED,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
) {
    val isReturn: Boolean
        get() = this.status == UserLoanStatus.RETURNED

    fun doReturn() {
        this.status = UserLoanStatus.RETURNED
    }
}
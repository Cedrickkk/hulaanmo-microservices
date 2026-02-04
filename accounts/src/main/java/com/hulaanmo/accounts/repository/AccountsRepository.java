package com.hulaanmo.accounts.repository;

import com.hulaanmo.accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Account, Long> {
}

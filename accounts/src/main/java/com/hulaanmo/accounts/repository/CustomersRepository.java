package com.hulaanmo.accounts.repository;

import com.hulaanmo.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customer, Long> {
}

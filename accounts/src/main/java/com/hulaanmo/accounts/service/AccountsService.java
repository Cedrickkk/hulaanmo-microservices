package com.hulaanmo.accounts.service;

import com.hulaanmo.accounts.domain.entity.Customer;
import com.hulaanmo.accounts.dto.AccountDTO;
import com.hulaanmo.accounts.dto.CustomerDTO;
import com.hulaanmo.accounts.mapper.AccountMapper;
import com.hulaanmo.accounts.mapper.CustomerMapper;
import com.hulaanmo.accounts.repository.AccountsRepository;
import com.hulaanmo.accounts.repository.CustomersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AccountsService {

    private AccountsRepository accountsRepository;
    private CustomersRepository customersRepository;

    public List<AccountDTO> getAllAccounts() {
        return accountsRepository.findAll()
                .stream()
                .map(AccountMapper::toDTO)
                .toList();
    }

    public void createAccount(CustomerDTO dto) {
        Customer customer = customersRepository.saveAndFlush(CustomerMapper.toEntity((dto)));
    }

}

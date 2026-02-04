package com.hulaanmo.accounts.service;

import com.hulaanmo.accounts.dto.AccountDTO;
import com.hulaanmo.accounts.repository.AccountsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {

    private AccountsRepository accountsRepository;

    public List<AccountDTO> getAllAccounts() {
        return accountsRepository.findAll()
                .stream()
                .map(account -> AccountDTO.builder()
                        .id(account.getId())
                        .type(account.getType())
                        .branchAddress(account.getBranchAddress())
                        .build())
                .toList();
    }

}

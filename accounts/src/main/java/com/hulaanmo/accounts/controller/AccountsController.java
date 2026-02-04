package com.hulaanmo.accounts.controller;

import com.hulaanmo.accounts.dto.AccountDTO;
import com.hulaanmo.accounts.dto.SuccessResponse;
import com.hulaanmo.accounts.repository.AccountsRepository;
import com.hulaanmo.accounts.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountsController {

    private final AccountsService accountsService;

    @Autowired
    public AccountsController(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    @GetMapping
    public ResponseEntity<SuccessResponse<List<AccountDTO>>> accounts() {
        List<AccountDTO> accounts = accountsService.getAllAccounts();
        SuccessResponse<List<AccountDTO>> response = SuccessResponse.ok(accounts, "Accounts retrieved successfully.");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }


    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("Accounts service is running.");
    }

}

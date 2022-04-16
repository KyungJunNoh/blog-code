package com.example.cap.service;

import com.example.cap.domain.Account;
import com.example.cap.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    public void updateGrade(Long id){
        Account account = accountRepository.findById(id).get();

        account.updateGrade();
    }
}

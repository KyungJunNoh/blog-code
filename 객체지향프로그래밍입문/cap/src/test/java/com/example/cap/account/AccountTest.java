package com.example.cap.account;

import com.example.cap.domain.Account;
import com.example.cap.enumType.Grade;
import com.example.cap.repository.AccountRepository;
import com.example.cap.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import java.time.LocalDate;

@SpringBootTest
public class AccountTest {

    @Autowired private AccountRepository accountRepository;
    @Autowired private AccountService accountService;
    @Autowired private EntityManager entityManager;

    @Test
    void 나이가_19세_이상일때_VIP(){
        // given
        accountRepository.save(
                Account.builder()
                        .name("노경준")
                        .age(20)
                        .createAt(LocalDate.now())
                        .grade(Grade.BASIC)
                        .build()
        );

        // when
        accountService.updateGrade(1L);

        entityManager.clear();

        // then
        Assertions.assertEquals(accountRepository.findAll().get(0).getGrade(), Grade.VIP);
    }

}

package com.example.cap.domain;

import com.example.cap.enumType.Grade;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private LocalDate createAt;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    public void updateGrade() {
        if(this.getAge() > 19) {
            this.grade = Grade.VIP;
        }
    }
}

package com.example.golf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
    @Id
    @Column(name="teacher_code", nullable = false, length = 3)
    private String teacherCode;

    @Column(name="teacher_name", length = 15)
    private String teacherName;

    @Column(name="class_name", length = 20)
    private String className;

    @Column(name="class_price")
    private int classPrice;

    @Column(name="teacher_gegist_date", length = 8)
    private String teacherGegistDate;
}

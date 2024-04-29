package com.example.golf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GolfClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="class_id", nullable = false)
    private Long classId;

    @Column(name="regist_month", length = 6)
    private String registMonth;

    @Column(name="class_no", length = 5)
    private String classNo;

    @Column(name="class_area", length = 15)
    private String classArea;

    @Column(name="tuition")
    private int tuition;

    @Column(name="teacher_code", length = 3)
    private String teacherCode;
}

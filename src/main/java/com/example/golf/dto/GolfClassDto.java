package com.example.golf.dto;

import com.example.golf.entity.GolfClass;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GolfClassDto {
    private Long classId;
    private String registMonth;
    private String classNo;
    private String classArea;
    private int tuition;
    private String teacherCode;
    private String memberName; // 회원명 추가
    private String memberId; // 회원번호 추가

    public static GolfClassDto fromGolfClass(GolfClass golfClass) {
        return new GolfClassDto(
                golfClass.getClassId(),
                golfClass.getRegistMonth(),
                golfClass.getClassNo(),
                golfClass.getClassArea(),
                golfClass.getTuition(),
                golfClass.getTeacherCode(),
                null,
                null
        );
    }

    public static GolfClassDto fromGolfClassDto(GolfClassDto dto) {
        return new GolfClassDto(
                dto.getClassId(),
                dto.getRegistMonth(),
                dto.getClassNo(),
                dto.getClassArea(),
                dto.getTuition(),
                dto.getTeacherCode(),
                dto.getMemberName(),
                dto.getMemberId()
        );
    }
}

package com.example.golf.dto;

import com.example.golf.entity.GolfClass;
import com.example.golf.entity.Member;
import com.example.golf.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoDto {
    private String registMonth;
    private String memberId;
    private String memberName;
    private String className;
    private String classArea;
    private int tuition;
    private String grade;

    public static MemberInfoDto fromMemberInfo(GolfClass golfClass, Member member, Teacher teacher) {
        return new MemberInfoDto(
                golfClass.getRegistMonth(),
                member.getMemberId(),
                member.getMemberName(),
                teacher.getClassName(),
                golfClass.getClassArea(),
                teacher.getClassPrice(),
                member.getGrade()
        );
    }

    public static MemberInfoDto fromMemberInfoDto(GolfClassDto golfClassDto, MemberDto memberDto, TeacherDto teacherDto) {
        return new MemberInfoDto(
                golfClassDto.getRegistMonth(),
                memberDto.getMemberId(),
                memberDto.getMemberName(),
                teacherDto.getClassName(),
                golfClassDto.getClassArea(),
                teacherDto.getClassPrice(),
                memberDto.getGrade()
        );
    }
}

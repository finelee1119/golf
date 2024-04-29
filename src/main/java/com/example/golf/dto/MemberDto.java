package com.example.golf.dto;

import com.example.golf.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private String memberId;
    private String memberName;
    private String phone;
    private String address;
    private String grade;
    private String className; // 강의명 필드 추가
    private int classPrice;   // 수강료 필드 추가

    public static MemberDto fromMember(Member member) {
        return new MemberDto(
                member.getMemberId(),
                member.getMemberName(),
                member.getPhone(),
                member.getAddress(),
                member.getGrade(),
                null,
                0
        );
    }

    public static MemberDto fromMemberDto(MemberDto dto) {
        return new MemberDto(
                dto.getMemberId(),
                dto.getMemberName(),
                dto.getPhone(),
                dto.getAddress(),
                dto.getGrade(),
                dto.getClassName(),
                dto.getClassPrice()
        );
    }
}

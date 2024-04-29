package com.example.golf.service;

import com.example.golf.dto.GolfClassDto;
import com.example.golf.entity.GolfClass;
import com.example.golf.repository.GolfClassRepository;
import com.example.golf.repository.MemberRepository;
import com.example.golf.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private final GolfClassRepository golfClassRepository;
    private final MemberRepository memberRepository;
    private final TeacherRepository teacherRepository;

    @Autowired
    public RegisterService(GolfClassRepository golfClassRepository, MemberRepository memberRepository, TeacherRepository teacherRepository) {
        this.golfClassRepository = golfClassRepository;
        this.memberRepository = memberRepository;
        this.teacherRepository = teacherRepository;
    }

    public void registerClass(GolfClassDto golfClassDto) {
        GolfClass golfClass = GolfClass.builder()
                .registMonth(golfClassDto.getRegistMonth())
//                회원명 : member테이블의 member_name / 회원명을 선택하면
//                회원번호 : member테이블의 member_id / 회원번호는 자동으로 출력됨
                .classArea(golfClassDto.getClassArea())
//                강의명 : teacher테이블의 class_name / 강의명을 선택하면
                .tuition((golfClassDto.getTuition())) // 수강료는 자동으로 출력됨
                .build();
        golfClassRepository.save(golfClass);
    }

}

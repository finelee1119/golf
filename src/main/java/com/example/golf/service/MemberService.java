package com.example.golf.service;

import com.example.golf.dto.MemberInfoDto;
import com.example.golf.entity.Member;
import com.example.golf.repository.MemberRepository;
import com.example.golf.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final TeacherRepository teacherRepository;

    public MemberService(MemberRepository memberRepository, TeacherRepository teacherRepository) {
        this.memberRepository = memberRepository;
        this.teacherRepository = teacherRepository;
    }

    public List<MemberInfoDto> findAll() {
        List<MemberInfoDto> memberInfoDtoList = new ArrayList<>();

    }
}


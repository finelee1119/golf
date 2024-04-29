package com.example.golf.service;

import com.example.golf.dto.TeacherDto;
import com.example.golf.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<TeacherDto> findAll() {
        List<TeacherDto> teacherDtoList = new ArrayList<>();

        DecimalFormat formatter = new DecimalFormat("###,###");

        teacherDtoList = teacherRepository.findAll()
                .stream()
                .map(teacher -> {
                    TeacherDto teacherDto = TeacherDto.fromTeacher(teacher);
                    teacherDto.setClassPriceFormatted(formatter.format(teacher.getClassPrice()));
                    return teacherDto;
                })
                .toList();
        return teacherDtoList;
    }
}

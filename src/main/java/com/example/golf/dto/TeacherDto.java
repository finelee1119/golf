package com.example.golf.dto;

import com.example.golf.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private String teacherCode;
    private String teacherName;
    private String className;
    private int classPrice;
    private String teacherGegistDate;

    private String classPriceFormatted;

    public static TeacherDto fromTeacher(Teacher teacher) {
        return new TeacherDto(
                teacher.getTeacherCode(),
                teacher.getTeacherName(),
                teacher.getClassName(),
                teacher.getClassPrice(),
                teacher.getTeacherGegistDate(),
                null
        );
    }

    public static TeacherDto fromTeacherDto(TeacherDto dto) {
        return new TeacherDto(
                dto.getTeacherCode(),
                dto.getTeacherName(),
                dto.getClassName(),
                dto.getClassPrice(),
                dto.getTeacherGegistDate(),
                dto.getClassPriceFormatted()
        );
    }
}

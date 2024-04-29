package com.example.golf.controller;

import com.example.golf.dto.TeacherDto;
import com.example.golf.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/golf")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teacherlist")
    public String showTeacherListView(Model model) {
        List<TeacherDto> teacherDtoList = teacherService.findAll();

        // 수강료를 원화 기호를 포함한 형식으로 변환
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.KOREA);
        teacherDtoList.forEach(teacherDto -> {
            String formattedPrice = currencyFormat.format(teacherDto.getClassPrice());
            teacherDto.setClassPriceFormatted(formattedPrice);
        });

        // 강사자격취득일을 yyyy년 MM월 dd일 형식의 문자열로 변환
        teacherDtoList.forEach(teacherDto -> {
            String formattedDate = String.format("%s년 %s월 %s일",
                    teacherDto.getTeacherGegistDate().substring(0, 4),
                    teacherDto.getTeacherGegistDate().substring(4, 6),
                    teacherDto.getTeacherGegistDate().substring(6));
            teacherDto.setTeacherGegistDate(formattedDate);
        });

        model.addAttribute("dto", teacherDtoList);
        return "teacher_list";
    }
}

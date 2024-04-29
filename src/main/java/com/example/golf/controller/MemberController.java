package com.example.golf.controller;

import com.example.golf.dto.MemberDto;
import com.example.golf.dto.MemberInfoDto;
import com.example.golf.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/golf")
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/memberlist")
    public String showMemberListView(Model model) {
        List<MemberInfoDto> memberInfoDtoList = memberService.findAll();
        model.addAttribute("dto", memberInfoDtoList);
        return "member_list";
    }
}

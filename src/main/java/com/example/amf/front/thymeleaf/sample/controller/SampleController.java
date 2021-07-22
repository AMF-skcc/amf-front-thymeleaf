package com.example.amf.front.thymeleaf.sample.controller;

import com.example.amf.front.thymeleaf.sample.service.SampleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.amf.front.thymeleaf.sample.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/")
public class SampleController {
    private final SampleService sampleService;

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String getLoginForm(Model model) {
        model.addAttribute("member", new MemberDto());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute MemberDto member) {
        log.info("member=" + member.toString());

        return "redirect:tables";
    }

    @GetMapping("/register")
    public String getRegisterForm(Model model) {
        model.addAttribute("member", new MemberDto());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute MemberDto member, Model model) {
        log.info("member=" + member.toString());

        return "redirect:tables";
    }

    @GetMapping("/tables")
    public String getTables(Model model) {
        model.addAttribute("members", sampleService.findAllMembers());

        return "tables";
    }

    @GetMapping("/profile/{memberId}")
    public String getProfile(@PathVariable Long memberId, Model model) {
        model.addAttribute("member", sampleService.findMember());
        model.addAttribute("memberId", memberId);

        return "profile";
    }
}

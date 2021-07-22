package com.example.amf.front.thymeleaf.sample.controller;

import com.example.amf.front.thymeleaf.sample.dto.MemberDto;
import com.example.amf.front.thymeleaf.sample.service.SampleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/simple")
public class SimpleSampleController {
    private final SampleService sampleService;

    @GetMapping("/index")
    public String index() {
        return "simple/index";
    }

    @GetMapping("/login")
    public String getLoginForm(Model model) {
        model.addAttribute("member", new MemberDto());
        return "simple/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute MemberDto member) {
        log.info("member=" + member.toString());

        return "redirect:tables";
    }

    @GetMapping("/register")
    public String getRegisterForm(Model model) {
        model.addAttribute("member", new MemberDto());
        return "simple/register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute MemberDto member, Model model) {
        log.info("Simple >>> ");
        log.info("member=" + member.toString());

        return "redirect:tables";
    }

    @GetMapping("/tables")
    public String getTables(Model model) {
        model.addAttribute("members", sampleService.findAllMembers());

        return "simple/tables";
    }

    @GetMapping("/profile/{memberId}")
    public String getProfile(@PathVariable Long memberId, Model model) {
        model.addAttribute("member", sampleService.findMember());
        model.addAttribute("memberId", memberId);

        return "simple/profile";
    }
}

package com.example.amf.front.thymeleaf.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.amf.front.thymeleaf.sample.dto.LoginDto;
import com.example.amf.front.thymeleaf.sample.dto.MemberDto;
import com.example.amf.front.thymeleaf.sample.service.SampleService;

import lombok.AllArgsConstructor;
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
        model.addAttribute("member", new LoginDto());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDto loginDto) {
    	log.info("login=" + loginDto.toString());
        
        if (sampleService.login(loginDto)) {
        	return "redirect:tables";
        }

        return "redirect:login";
    }

    @GetMapping("/register")
    public String getRegisterForm(Model model) {
        model.addAttribute("member", new MemberDto());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute MemberDto memberDto, Model model) {
        log.info("member=" + memberDto.toString());
        sampleService.save(memberDto);
        
        return "redirect:login";
    }

    @GetMapping("/tables")
    public String getTables(Model model) {
        model.addAttribute("members", sampleService.findAllMembers());

        return "tables";
    }

    @GetMapping("/profile/{memberId}")
    public String getProfile(@PathVariable Long memberId, Model model) {
        model.addAttribute("member", sampleService.findMember(memberId));

        return "profile";
    }
}

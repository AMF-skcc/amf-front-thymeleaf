package com.example.amf.front.thymeleaf.sample.service.impl;

import com.example.amf.front.thymeleaf.sample.dto.MemberDto;
import com.example.amf.front.thymeleaf.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {
    @Override
    public List<MemberDto> findAllMembers() {
        // RestTemplate or FeignClient
        List<MemberDto> memberDtoList = new ArrayList<>();
        memberDtoList.add(new MemberDto(Long.valueOf(1), "member1", "a@sk.com", "1234"));
        memberDtoList.add(new MemberDto(Long.valueOf(2), "member2", "b@sk.com", "1234"));

        return memberDtoList;
    }

    @Override
    public MemberDto findMember() {
        // RestTemplate or FeignClient
        MemberDto memberDto = new MemberDto(Long.valueOf(1), "member1", "a@sk.com", "1234");

        return memberDto;
    }
}

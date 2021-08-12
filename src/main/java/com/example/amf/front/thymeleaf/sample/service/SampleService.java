package com.example.amf.front.thymeleaf.sample.service;

import java.util.List;

import com.example.amf.front.thymeleaf.sample.dto.LoginDto;
import com.example.amf.front.thymeleaf.sample.dto.MemberDto;

public interface SampleService {
	public List<MemberDto> findAllMembers();
	public MemberDto findMember(Long memberId);
	public MemberDto save(MemberDto memberDto);
	public boolean login(LoginDto loginDto);
}

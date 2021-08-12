package com.example.amf.front.thymeleaf.sample.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.amf.front.thymeleaf.sample.dto.LoginDto;
import com.example.amf.front.thymeleaf.sample.dto.MemberDto;
import com.example.amf.front.thymeleaf.sample.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {
	static List<MemberDto> memberDtoList = new ArrayList<>();
	static long MEMBER_LAST_ID = 1;
	
    @Override
    public List<MemberDto> findAllMembers() {
        // RestTemplate or FeignClient
        return memberDtoList;
    }

    @Override
    public MemberDto findMember(Long memberId) {
        // RestTemplate or FeignClient
        MemberDto memberDto = new MemberDto();
        for (MemberDto member : memberDtoList) {
        	if (memberId.equals(member.getId())) {
        		memberDto = member;
        		break;
        	}
        }

        return memberDto;
    }

	@Override
	public MemberDto save(MemberDto memberDto) {
		// RestTemplate or FeignClient
		memberDto.setId(MEMBER_LAST_ID++);
		memberDtoList.add(memberDto);
		System.out.println(memberDtoList.toString());
		return memberDto;
	}

	@Override
	public boolean login(LoginDto loginDto) {
		// RestTemplate or FeignClient
		for (MemberDto member : memberDtoList) {
        	if (member.getContact().getEmail().equals(loginDto.getEmail()) &&
        			member.getPassword().equals(loginDto.getPassword())) {
        		return true;
        	}
        }
		
		return false;
	}
}

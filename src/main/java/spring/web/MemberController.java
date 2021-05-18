package spring.web;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import spring.service.MemberService;
import spring.web.dto.MemberDto;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor // final 사용시 => 자동 생성자 주입
public class MemberController {

    private final MemberService memberService; // 멤버 서비스 객체 선언

    // ? : java <------> html

    //회원가입 페이지 요청
    @GetMapping("/membersignup") // 요청 URL 정의 => 메소드 실행
    public String membersignup(){
        return "membersignup"; // 타임리프 HTML 반환
    }

    // 회원가입 처리
    @PostMapping("/membersignup") // 서로다른 Mapping 이면 동일한 URL 가능
    public void membersignup_c( MemberDto memberDto ){
                                // form 안에 있는 name 과  dto내 필드명이 동일한경우 자동 주입
        // jsp  Request : 객체
        // spring  HttpServletRequest request 객체 만들고 사용
                //        System.out.println( request.getParameter("name"));
                //        System.out.println( request.getParameter("memberid"));
        memberService.membersave(memberDto);


    }

}

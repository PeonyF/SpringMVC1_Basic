package springmvc1.servlet.web.frontcontroller.v4.controller;

import java.util.Map;

import springmvc1.servlet.domain.member.Member;
import springmvc1.servlet.domain.member.MemberRepository;
import springmvc1.servlet.web.frontcontroller.ModelView;
import springmvc1.servlet.web.frontcontroller.v3.ControllerV3;
import springmvc1.servlet.web.frontcontroller.v4.ControllerV4;

public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        String userName = paramMap.get("userName");
        int age = Integer.parseInt(paramMap.get("age"));
        Member member = new Member(userName, age);
        memberRepository.save(member);

        model.put("member",member);
        return "save-result";
    }
}

package springmvc1.servlet.web.frontcontroller.v4.controller;

import java.util.Map;

import springmvc1.servlet.web.frontcontroller.v4.ControllerV4;

public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}

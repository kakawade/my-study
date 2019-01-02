package com.kaka.study.service.Interaction.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: kaka
 * @Date: 2018/12/13 15:36
 * @Description:
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/say/hello")
    public String sayHello() {
        System.out.println("sssss");
        return "hello kaka";
    }
}

package com.example.samdiclass1.print;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // 화면이 아닌 json을 반환하기 위해 사용
@RequestMapping("/com/example/samdiclass1/print")
@RequiredArgsConstructor

public class PrintController {
    private final PrintService printService;

    @GetMapping()
    public String printHelloWorld() {
        return printService.printHelloWorld();}
    @PostMapping
    public void signup(@RequestBody CreateUserRequest request) {
        printService.signup(request);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return printService.findAllUsers();
    }
}

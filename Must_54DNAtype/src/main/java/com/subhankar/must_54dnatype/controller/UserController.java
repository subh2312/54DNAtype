package com.subhankar.must_54dnatype.controller;

import com.subhankar.must_54dnatype.model.DTO.LoginRequestDTO;
import com.subhankar.must_54dnatype.model.DTO.Result;
import com.subhankar.must_54dnatype.model.DTO.SignUpRequestDTO;
import com.subhankar.must_54dnatype.model.DTO.UpdateUserRequestDTO;
import com.subhankar.must_54dnatype.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/status")
    public String getStatus() {
        return userService.getStatus();
    }

    @PostMapping("/signup")
    public ResponseEntity<Result> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO) {
        return userService.addUser(signUpRequestDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<Result> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        return userService.login(loginRequestDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Result> getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Result> updateUser(@PathVariable String id, @RequestBody UpdateUserRequestDTO updateUserRequestDTO) {
        return userService.updateUser(id, updateUserRequestDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Result> deleteUser(@PathVariable String id) {
        return userService.deleteUser(id);
    }

}

package com.subhankar.must_54dnatype.controller;

import com.subhankar.must_54dnatype.model.DTO.Result;
import com.subhankar.must_54dnatype.service.OtpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/otp")
@RequiredArgsConstructor
public class OtpController {
    private final OtpService otpService;

    @GetMapping("/generate")
    public Integer generateOTP() {
        return otpService.generateOTP();
    }

    @GetMapping("/get")
    public Integer getOPTByKey() {
        return otpService.getOPTByKey();
    }

    @GetMapping("/clear")
    public void clearOTPFromCache() {
        otpService.clearOTPFromCache();
    }

    @GetMapping("/validate")
    public ResponseEntity<Result> validateOTP(@RequestParam String otp) {
        return otpService.validateOTP(Integer.parseInt(otp));
    }
}

package com.subhankar.must_54dnatype.service;

import com.subhankar.must_54dnatype.model.DTO.Result;
import org.springframework.http.ResponseEntity;

public interface OtpService {

    Integer generateOTP();

    Integer getOPTByKey();

    ResponseEntity<Result> validateOTP(Integer otp);

    void clearOTPFromCache();
}

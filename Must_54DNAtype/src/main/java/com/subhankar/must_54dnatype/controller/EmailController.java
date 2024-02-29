package com.subhankar.must_54dnatype.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.subhankar.must_54dnatype.model.DTO.EmailRequestDTO;
import com.subhankar.must_54dnatype.model.DTO.Result;
import com.subhankar.must_54dnatype.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<Result> sendEmail(@RequestBody EmailRequestDTO emailRequestDTO) {
           return emailService.sendEmail(emailRequestDTO.getTo());
    }
}

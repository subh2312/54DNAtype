package com.subhankar.must_54dnatype.service;

import com.subhankar.must_54dnatype.model.DTO.LoginRequestDTO;
import com.subhankar.must_54dnatype.model.DTO.Result;
import com.subhankar.must_54dnatype.model.DTO.SignUpRequestDTO;
import com.subhankar.must_54dnatype.model.DTO.UpdateUserRequestDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {
    String getStatus();

    ResponseEntity<Result> addUser(SignUpRequestDTO signUpRequestDTO);

    ResponseEntity<Result> login(LoginRequestDTO loginRequestDTO);

    ResponseEntity<Result> getUser(String id);

    ResponseEntity<Result> updateUser(String id, UpdateUserRequestDTO updateUserRequestDTO);

    ResponseEntity<Result> deleteUser(String id);

}

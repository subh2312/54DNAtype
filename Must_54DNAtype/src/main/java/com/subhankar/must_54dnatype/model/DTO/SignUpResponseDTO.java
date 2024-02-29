package com.subhankar.must_54dnatype.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class SignUpResponseDTO {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String nickName;
    private String userId;
}

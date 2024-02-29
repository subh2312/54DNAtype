package com.subhankar.must_54dnatype.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private String message;
    private String status;
    private Object data;
}

package com.example.week6.model;

import com.example.week6.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage {
    Object result;
    ResultCode resultCode;
    String details;
}
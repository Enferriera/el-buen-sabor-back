package com.example.buensaboruno.domain.dtos;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}

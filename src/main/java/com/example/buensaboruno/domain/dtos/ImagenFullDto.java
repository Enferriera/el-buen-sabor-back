package com.example.buensaboruno.domain.dtos;

import jakarta.persistence.Temporal;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class ImagenFullDto extends BaseFullDto{
    private String url;
}

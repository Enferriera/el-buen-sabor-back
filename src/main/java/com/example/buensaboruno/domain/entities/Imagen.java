package com.example.buensaboruno.domain.entities;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Imagen extends Base{

    private String url;

}

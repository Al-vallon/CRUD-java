package com.CRUD.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class GymRecordDTO {

    private Long id;
    private String exercise;
    private Integer weight;

}

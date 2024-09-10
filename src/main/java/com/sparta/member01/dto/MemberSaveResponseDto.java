package com.sparta.member01.dto;

import lombok.Getter;

@Getter
public class MemberSaveResponseDto {

    private final Long id;
    private final String name;

    public MemberSaveResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
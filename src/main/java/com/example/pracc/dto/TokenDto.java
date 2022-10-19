package com.example.pracc.dto;

import lombok.Getter;

@Getter
public class TokenDto {

    private final String accessToken;

    public TokenDto(String accessToken){
        this.accessToken = accessToken;
    }
}

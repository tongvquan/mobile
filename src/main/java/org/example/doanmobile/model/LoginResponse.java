package org.example.doanmobile.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginResponse {
    private String token;
}

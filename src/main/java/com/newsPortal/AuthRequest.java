package com.newsPortal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder

public class AuthRequest {
    private String username;
    private String password;

}

package com.flowforge.user.dto.response;

import com.flowforge.user.entity.User;

public record UserResponse(
    Long id,
    String firstName,
    String lastName,
    String email,
    Boolean active 
){
    public static UserResponse from(User user){
        return new UserResponse(
            user.getId(),
            user.getFirstName(),
            user.getLastName(),
            user.getEmail(),
            user.getActive()
        );
    }
}
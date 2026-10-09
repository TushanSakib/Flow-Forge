package com.flowforge.user.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateUserRequest(
    @NotBlank(message = "First name is required")
    String firstName,
    @NotBlank(message = "Last name is required")
    String lastName,
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    String email,

    @NotNull(message = "Active status is required")
    Boolean active
) {
}
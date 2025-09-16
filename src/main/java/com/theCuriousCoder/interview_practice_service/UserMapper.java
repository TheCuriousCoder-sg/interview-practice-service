package com.theCuriousCoder.interview_practice_service;

import org.mapstruct.*;

@Mapper
public interface UserMapper {

    @Mapping(source = "username", target = "name")
    UserResponse mapUserToUserResponse(User user);
}


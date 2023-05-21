package com.team1.citcitapi.user.model.dto.UserRequest;

import com.team1.citcitapi.user.model.AppUser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestPost {
    private String username;

    public AppUser convertToEntity() {
        return AppUser.builder().username(this.username).build();
    }
}

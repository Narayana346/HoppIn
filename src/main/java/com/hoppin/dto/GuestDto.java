package com.hoppin.dto;

import com.hoppin.entity.User;
import com.hoppin.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}

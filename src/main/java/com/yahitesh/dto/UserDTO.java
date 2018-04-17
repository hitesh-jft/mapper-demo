package com.yahitesh.dto;

import lombok.Data;

/**
 * Created by yahitesh on 17/4/18.
 */
@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private AddressDTO addressDTO;
}

package com.yahitesh.dto;

import lombok.Data;
import lombok.ToString;

/**
 * Created by yahitesh on 17/4/18.
 */
@Data
@ToString
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private AddressDTO addressDTO;
}

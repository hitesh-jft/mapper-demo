package com.yahitesh.model;

import com.yahitesh.dto.AddressDTO;
import lombok.Data;

/**
 * Created by yahitesh on 17/4/18.
 */
@Data
public class User {
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Address address;
}

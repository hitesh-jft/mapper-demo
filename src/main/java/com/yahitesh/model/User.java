package com.yahitesh.model;

import com.yahitesh.dto.AddressDTO;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Created by yahitesh on 17/4/18.
 */
@Data
@ToString
@Builder
public class User {
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Address address;
}

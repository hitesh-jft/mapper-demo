package com.yahitesh.dto;

import lombok.Data;
import lombok.ToString;

/**
 * Created by yahitesh on 17/4/18.
 */
@Data
@ToString
public class AddressDTO {

    private String street;
    private String city;
    private String state;
    private String zipCode;
}

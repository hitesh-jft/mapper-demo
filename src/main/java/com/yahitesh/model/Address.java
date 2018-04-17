package com.yahitesh.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Created by yahitesh on 17/4/18.
 */
@Data
@ToString
@Builder
public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;
}

package com.yahitesh.mapper;

import com.yahitesh.dto.AddressDTO;
import com.yahitesh.model.Address;
import org.mapstruct.Mapper;

/**
 * Created by yahitesh on 17/4/18.
 */
@Mapper
public interface AddressMapper {

    public AddressDTO addressToDto(Address address);
}

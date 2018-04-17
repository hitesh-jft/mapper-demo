package com.yahitesh.mapper;

import com.yahitesh.dto.AddressDTO;
import com.yahitesh.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by yahitesh on 17/4/18.
 */
@Mapper
public interface AddressMapper {

    public static final AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    public AddressDTO addressToDto(Address address);
}

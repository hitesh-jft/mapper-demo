package com.yahitesh.mapper;

import com.yahitesh.dto.AddressDTO;
import com.yahitesh.model.Address;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by yahitesh on 18/4/18.
 */
public class AddressMapperTest {
    private static Address address;

    @BeforeClass
    public static void setup() {
        address = Address.builder()
                .street("sector-62")
                .city("Noida")
                .state("UP")
                .zipCode("301405")
                .build();
    }

    @Test
    public void convertToDtoTest() {
        AddressDTO addressDTO = AddressMapper.INSTANCE.addressToDto(address);
        Assert.assertEquals(address.getStreet(), addressDTO.getStreet());
        Assert.assertEquals(address.getCity(), address.getCity());
        Assert.assertEquals(address.getState(), address.getState());
        Assert.assertEquals(address.getZipCode(), address.getZipCode());
    }
}

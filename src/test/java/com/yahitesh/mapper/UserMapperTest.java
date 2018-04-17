package com.yahitesh.mapper;

import com.yahitesh.dto.UserDTO;
import com.yahitesh.model.Address;
import com.yahitesh.model.User;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by yahitesh on 18/4/18.
 */
public class UserMapperTest {

    private static User user;

    @BeforeClass
    public static void setup() {
        user = User.builder()
                .userId(1L)
                .userName("Test123")
                .userEmail("test@gmail.com")
                .userPassword("test@123")
                .address(Address.builder()
                        .city("Noida")
                        .build())
                .build();
    }

    @Test
    public void convertToDtoTest() {
        UserDTO userDTO = UserMapper.INSTANCE.userToDto(user);
        Assert.assertEquals(userDTO.getId(), user.getUserId());
        Assert.assertEquals(userDTO.getName(), user.getUserName());
        Assert.assertEquals(userDTO.getPassword(), user.getUserPassword());
        Assert.assertEquals(userDTO.getEmail(), user.getUserEmail());
        Assert.assertEquals(userDTO.getAddressDTO().getCity(), user.getAddress().getCity());
    }
}

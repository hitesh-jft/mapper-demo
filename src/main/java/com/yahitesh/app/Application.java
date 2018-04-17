package com.yahitesh.app;

import com.yahitesh.dto.UserDTO;
import com.yahitesh.mapper.UserMapper;
import com.yahitesh.model.Address;
import com.yahitesh.model.User;

/**
 * Created by yahitesh on 17/4/18.
 */
public class Application {

    public static void main(String[] args) {

        Application app = new Application();
        User user = app.buildUser();
        UserDTO userDTO = UserMapper.INSTANCE.userToDto(user);
        System.out.println("USER     ::" + user);
        System.out.println("USER DTO ::" + userDTO);
    }

    private User buildUser() {
        return User.builder()
                .userId(0L)
                .userName("Test123")
                .userEmail("test@gmail.com")
                .userPassword("test@123")
                .address(buildUserAddress()).build();
    }

    private Address buildUserAddress() {
        return Address.builder()
                .street("sector-62")
                .city("Noida")
                .state("UP")
                .zipCode("123456")
                .build();
    }
}

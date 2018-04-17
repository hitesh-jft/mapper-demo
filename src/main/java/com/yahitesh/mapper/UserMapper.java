package com.yahitesh.mapper;

import com.yahitesh.dto.UserDTO;
import com.yahitesh.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Created by yahitesh on 17/4/18.
 */
@Mapper(uses = {AddressMapper.class})
public interface UserMapper {

    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
            @Mapping(source = "userId", target = "id"),
            @Mapping(source = "userName", target = "name"),
            @Mapping(source = "userEmail", target = "email"),
            @Mapping(source = "userPassword", target = "password"),
            @Mapping(source = "address", target = "addressDTO")
    })
    public UserDTO userToDto(User user);
}

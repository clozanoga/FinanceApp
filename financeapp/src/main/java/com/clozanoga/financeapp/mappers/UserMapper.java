package com.clozanoga.financeapp.mappers;

import org.mapstruct.Mapper;

import com.clozanoga.financeapp.domain.User;
import com.clozanoga.financeapp.dtos.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	UserDTO userToUserDTO(User user);
	User userDTOToUser(UserDTO userDTO);

}

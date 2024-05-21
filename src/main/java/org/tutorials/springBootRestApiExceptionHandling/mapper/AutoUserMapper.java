package org.tutorials.springBootRestApiExceptionHandling.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tutorials.springBootRestApiExceptionHandling.dto.UserDto;
import org.tutorials.springBootRestApiExceptionHandling.entity.User;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);
    UserDto mapToUserDto(User user);
    User mapToUser(UserDto userDto);
}

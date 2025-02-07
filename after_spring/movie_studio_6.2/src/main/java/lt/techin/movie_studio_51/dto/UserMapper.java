package lt.techin.movie_studio_51.dto;

import lt.techin.movie_studio_51.model.Role;
import lt.techin.movie_studio_51.model.User;

import java.util.List;

public class UserMapper {

//  public static UserResponseDTO toUserResponseDTO(UserRequestDTO userRequestDTO) {
//    return new UserResponseDTO(userRequestDTO.username(), userRequestDTO.roles());
//  }

  public static User toUser(UserRequestDTO userRequestDTO) {
    return new User(userRequestDTO.username(), userRequestDTO.password(), List.of());
  }

  public static UserResponseDTO toUserResponseDTO(User user) {
    return new UserResponseDTO(user.getId(), user.getUsername(), user.getRoles());
  }
}

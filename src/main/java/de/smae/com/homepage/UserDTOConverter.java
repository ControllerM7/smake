package de.smae.com.homepage;

import org.springframework.stereotype.Component;

@Component
public class UserDTOConverter {
    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setPassword(user.getPassword());
        userDTO.setUserName(user.getUserName());

        return userDTO;
    }

    public User toModel(UserDTO userDTO) {
        User user = new User();
        user.setPassword(userDTO.getPassword());
        user.setUserName(userDTO.getUserName());
        user.setId(userDTO.getId());

        return user;
    }
}

package com.ecommerceproject.service.user.UserService.service;

import com.ecommerceproject.service.user.UserService.dto.UserDTO;
import com.ecommerceproject.service.user.UserService.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Método que orquestra o fluxo de criação 
     * de usuários.
     * 
     * @param userDTO
     * @return
     */
    public UserDTO createUser(UserDTO userDTO) {
        return null;
    }

    /***
     * Método que orquestra o fluxo de atualização
     * de usuário
     * 
     * @param userDTO
     * @return
     */
    public UserDTO updateUser(UserDTO userDTO){
        return null;
    }

    /**
     * Mét
     * 
     * @param idUser
     */
    public void deleteUser(Long idUser) {

    }
}
package org.example.tp3.exo1;

import org.example.tp2.exo2.Utilisateur;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Utilisateur getUserById(long id) {
        return userRepository.findUserById(id);
    }
}

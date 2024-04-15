package org.example.tp3.exo1;

import org.example.tp2.exo2.Utilisateur;

public interface UserRepository {
    Utilisateur findUserById(long id);
}

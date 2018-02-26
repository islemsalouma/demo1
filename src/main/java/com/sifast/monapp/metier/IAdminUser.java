package com.sifast.monapp.metier;

import java.util.List;

import com.sifast.monapp.entities.Role;
import com.sifast.monapp.entities.User;

public interface IAdminUser extends IAdminCategoriesMetier {

    public void addUser(User u);

    public User getUser(Long idUser);

    public void deleteUser(Long idUser);

    public void updateUser(User u);

    public List<User> listUser();

    public void attribuerRole(Role r, Long userID);

}

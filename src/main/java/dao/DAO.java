package dao;

import Entities.Users;

import java.util.Collection;
import java.util.List;

/**
 * Created by Paul on 24/07/2017.
 */
public interface DAO {
    public Collection<Users> getUsers();
    public void addUser(Users u);
    public void updateUser(Users u);
    public List<Users> listUsers();
    public Users getUserById(int id);
    public void removeUser(int id);
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Admin
 */
import dao.UserDao;
import java.util.List;
import model.User;
public class UserService {
    private UserDao userDao;    
    
    public UserService() {
        userDao = new UserDao();
    }
    
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
    public void addUser(User user ){
        userDao.addUser(user);
    }
    public void deleteUser(int id){
        userDao.deleteUser(id);
    }
    public User getUserByid(int id){
        return userDao.getUserById(id);
    }
    public void updateUser(User user){
        userDao.updateUser(user);
    }
}
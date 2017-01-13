package eth.vote.service;

import java.util.List;

import eth.vote.beans.Topic;
import eth.vote.beans.User;
import eth.vote.managers.UserManager;
import org.springframework.stereotype.Service;



@Service("userService")
public class UserServiceImpl implements UserService {

    UserManager uManager = new UserManager();

    @Override
    public List<User> getAllUsers() {
        return uManager.getUsers();
    }

    @Override
    public void addUser(User user) {
        uManager.add(user);
    }

    @Override
    public void loginUser(String userId){
        uManager.login(userId);
    };

    @Override
    public User getLoggedInUser(){
        return uManager.getLoggedIn();
    };


    @Override
    public void removeUser(String id) {

        User userToRemove = uManager.get(id);
        uManager.remove(userToRemove);
    }

    @Override
    public void removeAll() {
        uManager.removeAll();
    }

    @Override
    public void addTopic(Topic newTopic){
        uManager.addTopic(newTopic.getUserId(), newTopic);

    }
}


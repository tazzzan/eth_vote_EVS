package eth.vote.service;

import eth.vote.beans.Topic;
import eth.vote.beans.User;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();

    public void addUser(User user);

    public void loginUser(String userId);

    public User getLoggedInUser();

    public void removeUser(String id);

    public void removeAll();

    public void addTopic(Topic newTopic);
}

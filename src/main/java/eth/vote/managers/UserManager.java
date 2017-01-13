package eth.vote.managers;

import eth.vote.beans.Topic;
import eth.vote.beans.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilja on 05.01.17.
 */
public class UserManager {
    List<User> users = new ArrayList<User>();
    User loggedIn;

    public void add(User newUser){
        User user = new User();
        user.setName(newUser.getName());
        users.add(user);
    }

    public User get(String id){
        for(User u: users) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public  void login(String id){
        loggedIn = get(id);
    }

    public void remove(User user){
        users.remove(user);
    }

    public void removeAll(){
        users.clear();
    }

    public void addTopic(String userId, Topic topic){
        get(userId).getTopics().add(topic);
    }

    /** Getter and Setter
     */

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(User loggedIn) {
        this.loggedIn = loggedIn;
    }
}



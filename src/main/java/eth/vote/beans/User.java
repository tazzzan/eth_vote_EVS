package eth.vote.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
	private String name;
	private String id;

	private List<Topic> topics = new ArrayList<Topic>();


    // Constructors
    public User() { 
    	this.id = UUID.randomUUID().toString();
    }

    // Getters and Setters
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }
}

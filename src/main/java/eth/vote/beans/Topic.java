package eth.vote.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Topic {
	String id; 
	String name; 
	String userId;
	String description;
	Date date;

	List<VoteOption> voteOptions = new ArrayList<>();

	List<Vote> votes = new ArrayList<>();
	
	public Topic () {
		this.id = UUID.randomUUID().toString();
	}
	
	public Topic(String name, String description, String userId, List<VoteOption> voteOptions){
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.description = description;
		this. userId = userId;
		this.voteOptions = voteOptions;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Vote> getVotes() {
		return votes;
	}

	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	public List<VoteOption> getVoteOptions() {
		return voteOptions;
	}

	public void setVoteOptions(List<VoteOption> voteOption) {
		this.voteOptions = voteOption;
	}
}

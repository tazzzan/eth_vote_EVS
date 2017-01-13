package eth.vote.managers;

import java.util.ArrayList;
import java.util.List;

import eth.vote.beans.Topic;
import eth.vote.beans.Vote;
import eth.vote.beans.VoteOption;

public class TopicManager {
	List<Topic> topics = new ArrayList<Topic>();
	
	public TopicManager() {
		makeSamples();
	}
	
	/**
	 * Functions
	 */
	
	public Topic create(String name, String description, String userId, List<VoteOption> voteOptions){
		Topic newTopic = new Topic(name, description, userId, voteOptions);
		topics.add(newTopic);
		
		return newTopic;
	}
	
	public Topic get(String topicId){
		for(Topic topic : topics){
			if(topic.getId().equals(topicId)){
				return topic;
			}
		}
		return null;
	}
	
	public void delete(String topicId){
		topics.remove(get(topicId));
	}

	public void addVote(Vote vote) {
		Topic topic = get(vote.getReferenceId());
		topic.getVotes().add(vote);
	}

	public Integer[] countVotes(String id){
		int countYes = 0;
		int countNo = 0;
		int countPerhaps = 0;

		Integer[] voteCounts = new Integer[3];

		Topic topic = get(id);
		for(Vote vote : topic.getVotes()){
			if(vote.getVoteOption().getType().equals("Yes")){
				countYes++;
			}
			if(vote.getVoteOption().getType().equals("No")){
				countNo++;
			}
			if(vote.getVoteOption().getType().equals("Perhaps")){
				countPerhaps++;
			}
		}

		voteCounts[0]=countYes;
		voteCounts[1]=countNo;
		voteCounts[2]=countPerhaps;

		return voteCounts;

	}
	public void makeSamples(){


		List<VoteOption> voteOptions = new ArrayList<>();
		voteOptions.add(VoteOption.YES);
		voteOptions.add(VoteOption.NO);
		voteOptions.add(VoteOption.PERHAPS);

        topics.add(new Topic("Better broadband","The life could be much easier having higher speed rates", "ID", voteOptions));
        topics.add(new Topic("No tutions fees anymore!", "Students need to go to college without worrying about money", "ID",voteOptions));
        topics.add(new Topic("Coffee for free in Glasgow!", "Having coffee free makes the learning efficiency better",  "ID",voteOptions));
        topics.add(new Topic("No trees in Glasgow!","Who needs any trees?", "ID",voteOptions));
	}
	
	/**
	 * Getters and Setters
	 * 
	 */
	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	
	
	
}

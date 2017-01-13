package eth.vote.service;

import eth.vote.beans.Topic;
import eth.vote.beans.Vote;
import eth.vote.beans.VoteOption;

import java.util.List;

/**
 * Created by ilja on 05.01.17.
 */
public interface TopicService {
    Topic addTopic(Topic topic, List<VoteOption> voteOptions);
    List<Topic> getTopics();
    void editTopic(Topic topic);
    void addVote(Vote vote);
    Integer[] countVotes(String topicId);
}

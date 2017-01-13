package eth.vote.service;

import eth.vote.beans.Topic;
import eth.vote.beans.Vote;
import eth.vote.beans.VoteOption;
import eth.vote.managers.TopicManager;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ilja on 05.01.17.
 */

@Service("TopicService")
public class TopicServiceImpl implements  TopicService {

    TopicManager tManager = new TopicManager();


    @Override
    public Topic addTopic(Topic topic, List<VoteOption> voteOptions) {

        Topic newTopic = tManager.create(
                topic.getName(),
                topic.getDescription(),
                topic.getUserId(),
                voteOptions);

        System.out.println("topic saved: "+newTopic.getName());

        return newTopic;

    }


    @Override
    public List<Topic> getTopics(){
        return tManager.getTopics();
    }


    @Override
    public void editTopic(Topic topic){
    }

    @Override
    public void addVote(Vote vote){
        tManager.addVote(vote);
    }

    @Override
    public Integer[] countVotes(String topicId){
        return tManager.countVotes(topicId);
    }

}

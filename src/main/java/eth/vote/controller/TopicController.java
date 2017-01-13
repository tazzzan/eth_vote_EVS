package eth.vote.controller;

import eth.vote.beans.Topic;
import eth.vote.managers.TopicManager;
import eth.vote.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ilja on 05.01.17.
 */
@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    TopicService tService;

    @Autowired
    UserService uService;

    @Autowired
    VoteService vService;

    @RequestMapping(value="/topicslist.json", method = RequestMethod.GET)
    public @ResponseBody List<Topic> fetchTopics(){
        for(Topic topic: tService.getTopics()){
            System.out.println("topic: " +topic.getName() + topic.getId());
        }

        return tService.getTopics();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public @ResponseBody void addTopic(@RequestBody Topic topic){
        Topic createdTopic = tService.addTopic(topic, vService.getStandardVoteoptions());
        uService.addTopic(createdTopic);
        System.out.println("size topics logged in: " +uService.getLoggedInUser().getTopics().size());
    }

    @RequestMapping(value="/edit", method = RequestMethod.POST)
    public @ResponseBody void editTopic(@RequestBody Topic topic){
        tService.editTopic(topic);
    }

    @RequestMapping("/partial/topic")
    public String getPartialPage() {
        return "/views/liveStream/topic.html";
    }


}

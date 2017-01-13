package eth.vote.controller;

import eth.vote.beans.Vote;
import eth.vote.service.TopicService;
import eth.vote.service.UserService;
import eth.vote.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ilja on 06.01.17.
 */
@Controller
@RequestMapping("/vote")
public class VoteController {

    @Autowired
    TopicService tService;

    @Autowired
    UserService uService;

    @Autowired
    VoteService vService;

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public @ResponseBody void addVote(@RequestBody Vote vote){
        Vote createdVote = vService.addVote(vote);
        tService.addVote(createdVote);
        System.out.println("vote added: " + vote.getVoteOption().getType());
    }

    @RequestMapping(value="/count/{topicId}", method = RequestMethod.GET)
    public @ResponseBody Integer[] countVotes(@PathVariable String topicId){
        return tService.countVotes(topicId);
    }

}

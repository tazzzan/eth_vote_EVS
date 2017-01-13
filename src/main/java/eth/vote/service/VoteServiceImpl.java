package eth.vote.service;

import eth.vote.beans.Vote;
import eth.vote.beans.VoteOption;
import eth.vote.managers.VoteManager;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ilja on 05.01.17.
 */
@Service("VoteService")
public class VoteServiceImpl implements  VoteService{

    VoteManager vManager = new VoteManager();

    @Override
    public Vote addVote(Vote vote){
        return vManager.add(vote);
    }

    @Override
    public List<VoteOption> getStandardVoteoptions(){
        return vManager.getVoteOptions();
    }
}

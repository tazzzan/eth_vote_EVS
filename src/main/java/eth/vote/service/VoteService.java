package eth.vote.service;

import eth.vote.beans.Vote;
import eth.vote.beans.VoteOption;

import java.util.List;

/**
 * Created by ilja on 05.01.17.
 */
public interface VoteService {
    Vote addVote(Vote vote);
    List<VoteOption> getStandardVoteoptions();
}

package eth.vote.managers;

import eth.vote.beans.Vote;
import eth.vote.beans.VoteOption;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilja on 06.01.17.
 */
public class VoteManager {
    private List<Vote> votesList = new ArrayList<>();
    private List<VoteOption> voteOptions = new ArrayList<VoteOption>();

    public VoteManager(){
        voteOptions.add(VoteOption.YES);
        voteOptions.add(VoteOption.NO);
        voteOptions.add(VoteOption.PERHAPS);
    }

    public Vote add(Vote vote){
        Vote newVote = new Vote();
        newVote.setUserId(vote.getUserId());
        newVote.setReferenceId(vote.getReferenceId());
        newVote.setVoteOption(vote.getVoteOption());

        getVotesList().add(newVote);

        return newVote;
    }

    public Vote get(String voteId){
        for(Vote vote: getVotesList()){
            if(vote.getId().equals(voteId)){
                return vote;
            }
        }
        return null;
    }

    public List<Vote> getVotesList() {
        return votesList;
    }

    public void setVotesList(List<Vote> votesList) {
        this.votesList = votesList;
    }

    public List<VoteOption> getVoteOptions() {
        return voteOptions;
    }

    public void setVoteOptions(List<VoteOption> voteOptions) {
        this.voteOptions = voteOptions;
    }
}

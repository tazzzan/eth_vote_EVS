package eth.vote.beans;

/**
 * Created by ilja on 06.01.17.
 */

public class VoteOption {
    private static String  Yes               =  "Yes";
    private static String  No                =  "No";
    private static String  Perhaps           =  "Perhaps";

    public static VoteOption YES = new VoteOption(Yes);
    public static VoteOption NO = new VoteOption(No);
    public static VoteOption PERHAPS = new VoteOption(Perhaps);

    String type;

    public VoteOption(){
    }

    public VoteOption(String type) {
        this.type = type;
    }

    public static String getYes() {
        return Yes;
    }

    public static void setYes(String yes) {
        Yes = yes;
    }

    public static String getNo() {
        return No;
    }

    public static void setNo(String no) {
        No = no;
    }

    public static String getPerhaps() {
        return Perhaps;
    }

    public static void setPerhaps(String perhaps) {
        Perhaps = perhaps;
    }

    public static VoteOption getYES() {
        return YES;
    }

    public static void setYES(VoteOption YES) {
        VoteOption.YES = YES;
    }

    public static VoteOption getNO() {
        return NO;
    }

    public static void setNO(VoteOption NO) {
        VoteOption.NO = NO;
    }

    public static VoteOption getPERHAPS() {
        return PERHAPS;
    }

    public static void setPERHAPS(VoteOption PERHAPS) {
        VoteOption.PERHAPS = PERHAPS;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package domain;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class MatchResult {
    private final long id;
    private final long winnerId;
    private final boolean isDraw;
    private final boolean technicalLoseBoth;
    private final int firstMemberRaitingPoins;
    private final int secondMemberRaitingPoints;

    public MatchResult(long id, long winnerId, boolean isDraw, boolean technicalLoseBoth, int firstMemberRaitingPoins, int secondMemberRaitingPoints) {
        this.id = id;
        this.winnerId = winnerId;
        this.isDraw = isDraw;
        this.technicalLoseBoth = technicalLoseBoth;
        this.firstMemberRaitingPoins = firstMemberRaitingPoins;
        this.secondMemberRaitingPoints = secondMemberRaitingPoints;
    }

    public long getId() {
        return id;
    }

    public long getWinnerId() {
        return winnerId;
    }

    public boolean isDraw() {
        return isDraw;
    }

    public boolean isTechnicalLoseBoth() {
        return technicalLoseBoth;
    }

    public int getFirstMemberRaitingPoins() {
        return firstMemberRaitingPoins;
    }

    public int getSecondMemberRaitingPoints() {
        return secondMemberRaitingPoints;
    }
}

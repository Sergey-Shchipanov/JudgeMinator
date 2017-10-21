package domain;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class Match {
    private final long id;
    private final long firstMemberId;
    private final long secondMemberId;
    private final long winnerId;
    private final String videoUrl;
    private final long judgeId;
    private final long resultId;

    public Match(long id, long firstMemberId, long secondMemberId, long winnerId, String videoUrl, long judgeId, long resultId) {
        this.id = id;
        this.firstMemberId = firstMemberId;
        this.secondMemberId = secondMemberId;
        this.winnerId = winnerId;
        this.videoUrl = videoUrl;
        this.judgeId = judgeId;
        this.resultId = resultId;
    }

    public long getId() {
        return id;
    }

    public long getFirstMemberId() {
        return firstMemberId;
    }

    public long getSecondMemberId() {
        return secondMemberId;
    }

    public long getWinnerId() {
        return winnerId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public long getResultId() {
        return resultId;
    }

    public long getJudgeId() {
        return judgeId;
    }
}

package ru.dczm.JudgeMinator.domain;

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

    public Match(long id, long firstMemberId, long secondMemberId, long winnerId, String videoUrl, long judgeId) {
        this.id = id;
        this.firstMemberId = firstMemberId;
        this.secondMemberId = secondMemberId;
        this.winnerId = winnerId;
        this.videoUrl = videoUrl;
        this.judgeId = judgeId;
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

    public long getJudgeId() {
        return judgeId;
    }
}

package ru.dczm.JudgeMinator.domain;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class JudgeProfile {
    private final long id;
    private final long userId;
    private final long categoryId;

    public JudgeProfile(long id, long userId, long categoryId) {
        this.id = id;
        this.userId = userId;
        this.categoryId = categoryId;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public long getCategoryId() {
        return categoryId;
    }
}

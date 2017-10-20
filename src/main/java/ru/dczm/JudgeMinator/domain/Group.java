package ru.dczm.JudgeMinator.domain;

import java.util.List;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class Group {
    private final long id;
    private final List<Long> mathces;

    public Group(long id, List<Long> mathces) {
        this.id = id;
        this.mathces = mathces;
    }

    public long getId() {
        return id;
    }

    public List<Long> getMathces() {
        return mathces;
    }
}

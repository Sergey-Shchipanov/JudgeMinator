package ru.dczm.JudgeMinator.domain;

import java.util.List;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class Competition {
    private final long id;
    private final String name;
    private final List<Long> groups;
    private final List<Long> playOff;
    private final List<Long> finals;
    private final List<Long> orders;
    private final List<Long> members;
    private final List<Long> judges;


    public Competition(long id, String name, List<Long> groups, List<Long> playOff, List<Long> finals, List<Long> orders, List<Long> members, List<Long> judges) {
        this.id = id;
        this.name = name;
        this.groups = groups;
        this.playOff = playOff;
        this.finals = finals;
        this.orders = orders;
        this.members = members;
        this.judges = judges;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Long> getGroups() {
        return groups;
    }

    public List<Long> getPlayOff() {
        return playOff;
    }

    public List<Long> getFinals() {
        return finals;
    }

    public List<Long> getOrders() {
        return orders;
    }

    public List<Long> getMembers() {
        return members;
    }

    public List<Long> getJudges() {
        return judges;
    }
}

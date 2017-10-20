package domain;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class Order {
    private final long id;
    private final long userId;
    private final boolean approved;

    public Order(long id, long userId, boolean approved) {
        this.id = id;
        this.userId = userId;
        this.approved = approved;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public boolean isApproved() {
        return approved;
    }

}

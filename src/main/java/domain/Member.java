package domain;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class Member {
    private final long id;
    private final long userId;
    private final long categoryId;
    private final double raiting;

    public long getUserId() {
        return userId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public long getId() {
        return id;
    }

    public double getRaiting() {
        return raiting;
    }

    public Member(long id, long userId, long categoryId, double raiting) {
        this.id = id;

        this.userId = userId;
        this.categoryId = categoryId;
        this.raiting = raiting;
    }
}

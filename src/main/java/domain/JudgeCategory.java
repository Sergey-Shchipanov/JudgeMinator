package domain;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class JudgeCategory {
    private final long id;
    private final String name;

    public JudgeCategory(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

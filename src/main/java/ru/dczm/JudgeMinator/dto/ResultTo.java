package dto;

/**
 * @author anshipanov
 */
public class ResultTo {

    private final boolean success;

    public ResultTo(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}

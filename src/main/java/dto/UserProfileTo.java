package dto;

import domain.UserProfile;

/**
 * @author anshipanov
 */
public class UserProfileTo {

    private final String name;

    public UserProfileTo(String name) {
        this.name = name;
    }

    public UserProfileTo(UserProfile userProfile) {
        this(userProfile.getName());
    }

    public String getName() {
        return name;
    }
}

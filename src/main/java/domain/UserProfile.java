package domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class UserProfile {
    private final long _id;
    private final String name;
    private final String lastName;
    private final String city;
    private final String club;

    public UserProfile(long _id, String name, String lastName, String city, String club) {
        this._id = _id;
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.club = club;
    }

    public long get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getClub() {
        return club;
    }

}

package domain;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class UserProfile {
    private final long id;
    private final String name;
    private final String lastName;
    private final String city;
    private final String club;

    public UserProfile(long id, String name, String lastName, String city, String club) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.club = club;
    }

    public long getId() {
        return id;
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
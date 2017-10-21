package dao;

import com.mongodb.client.MongoCollection;
import domain.UserProfile;
import org.springframework.stereotype.Repository;

/**
 * @author anshipanov
 */
@Repository
public class UserProfileDao {

    //private final MongoCollection<UserProfile> collection;

    public UserProfileDao() {
        //this.collection = collection;
    }

    public UserProfile findOne(long id) {
        return null;
    }

    public void insert(UserProfile profile) {

    }
}

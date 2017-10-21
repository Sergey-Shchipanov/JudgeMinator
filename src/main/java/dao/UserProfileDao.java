package dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import domain.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author anshipanov
 */
@Repository
public class UserProfileDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public UserProfileDao() {
        System.out.println("DAO");
    }

    final String COLLECTION = "cars";

    public void create(UserProfile userProfile) {
        mongoTemplate.insert(userProfile);
    }

    public UserProfile find(long id) {
        return mongoTemplate.findById(id, UserProfile.class);
    }

}

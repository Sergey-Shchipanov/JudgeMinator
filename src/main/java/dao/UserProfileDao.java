package dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import domain.UserProfile;
import org.mongojack.JacksonDBCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import utils.MongoCollectionJudgeMinator;

/**
 * @author anshipanov
 */
@Repository
public class UserProfileDao {

    @Autowired
    private final MongoClient mongoClient;

    private MongoCollectionJudgeMinator<Long, UserProfile> collectionJudgeMinator;

    public UserProfileDao() {
        collectionJudgeMinator = new MongoCollectionJudgeMinator<Long, UserProfile>(mongoClient.getDatabase("jack").getCollection("test"));
        System.out.println("DAO");
    }

    public void create(UserProfile userProfile) throws JsonProcessingException {
        collectionJudgeMinator.insert(userProfile);
    }

    public UserProfile find(long id) throws JsonProcessingException {
        return (UserProfile) collectionJudgeMinator.find(id);
    }
}

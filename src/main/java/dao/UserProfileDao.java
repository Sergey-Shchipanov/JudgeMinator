package dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import domain.UserProfile;
import utils.MongoCollectionX;

/**
 * @author anshipanov
 */
public class UserProfileDao {

    private MongoCollectionX<Long, UserProfile> collectionJudgeMinator;

    public UserProfileDao(MongoCollectionX<Long, UserProfile> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(UserProfile userProfile) throws JsonProcessingException {
        collectionJudgeMinator.insert(userProfile);
    }

    public UserProfile find(long id) throws JsonProcessingException {
        return collectionJudgeMinator.find(id);
    }
}

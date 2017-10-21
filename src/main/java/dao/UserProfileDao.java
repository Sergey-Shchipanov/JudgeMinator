package dao;

import com.mongodb.client.FindIterable;
import domain.UserProfile;
import utils.MongoCollectionX;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author anshipanov
 */
public class UserProfileDao {

    private MongoCollectionX<Long, UserProfile> collectionJudgeMinator;

    public UserProfileDao(MongoCollectionX<Long, UserProfile> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(UserProfile userProfile) {
        collectionJudgeMinator.insert(userProfile);
    }

    public Optional<UserProfile> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<UserProfile> updateUserProfile(long userId, UserProfile newProfile) {
        return collectionJudgeMinator.update(userId, newProfile);
    }

    public List<UserProfile> findAll() {
        FindIterable<UserProfile> profiles = collectionJudgeMinator.findAll();
        List<UserProfile> result = new ArrayList<>();
        for (UserProfile profile : profiles) {
            result.add(profile);
        }
        return result;
    }
}

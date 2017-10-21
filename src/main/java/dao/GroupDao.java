package dao;

import domain.Group;
import utils.MongoCollectionX;

import java.util.Optional;

/**
 * Created by s_shchipanov.
 */
public class GroupDao {
    private MongoCollectionX<Long, Group> collectionJudgeMinator;

    public GroupDao(MongoCollectionX<Long, Group> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(Group group) {
        collectionJudgeMinator.insert(group);
    }

    public Optional<Group> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<Group> updateUserProfile(long userId, Group newGroup) {
        return collectionJudgeMinator.update(userId, newGroup);
    }
}

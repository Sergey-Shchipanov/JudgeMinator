package dao;

import domain.MemberCategory;
import utils.MongoCollectionX;

import java.util.Optional;

/**
 * Created by s_shchipanov.
 */
public class MemberCategoryDao {
    private MongoCollectionX<Long, MemberCategory> collectionJudgeMinator;

    public MemberCategoryDao(MongoCollectionX<Long, MemberCategory> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(MemberCategory memberCategory) {
        collectionJudgeMinator.insert(memberCategory);
    }

    public Optional<MemberCategory> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<MemberCategory> updateUserProfile(long userId, MemberCategory newMemberCategory) {
        return collectionJudgeMinator.update(userId, newMemberCategory);
    }
}

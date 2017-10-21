package dao;

import domain.JudgeProfile;
import utils.MongoCollectionX;

import java.util.Optional;

/**
 * Created by s_shchipanov.
 */
public class JudgeProfileDao {
    private MongoCollectionX<Long, JudgeProfile> collectionJudgeMinator;

    public JudgeProfileDao(MongoCollectionX<Long, JudgeProfile> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(JudgeProfile judgeProfile) {
        collectionJudgeMinator.insert(judgeProfile);
    }

    public Optional<JudgeProfile> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<JudgeProfile> updateUserProfile(long userId, JudgeProfile newJudgeProfile) {
        return collectionJudgeMinator.update(userId, newJudgeProfile);
    }
}

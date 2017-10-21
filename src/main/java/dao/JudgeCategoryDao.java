package dao;

import domain.JudgeCategory;
import utils.MongoCollectionX;

import java.util.Optional;

/**
 * Created by s_shchipanov.
 */
public class JudgeCategoryDao {
    private MongoCollectionX<Long, JudgeCategory> collectionJudgeMinator;

    public JudgeCategoryDao(MongoCollectionX<Long, JudgeCategory> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(JudgeCategory judgeCategory) {
        collectionJudgeMinator.insert(judgeCategory);
    }

    public Optional<JudgeCategory> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<JudgeCategory> updateUserProfile(long userId, JudgeCategory newJudgeCategory) {
        return collectionJudgeMinator.update(userId, newJudgeCategory);
    }
}

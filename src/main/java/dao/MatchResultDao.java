package dao;

import domain.MatchResult;
import utils.MongoCollectionX;

import java.util.Optional;

/**
 * Created by s_shchipanov.
 */
public class MatchResultDao {
    private MongoCollectionX<Long, MatchResult> collectionJudgeMinator;

    public MatchResultDao(MongoCollectionX<Long, MatchResult> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(MatchResult matchResult) {
        collectionJudgeMinator.insert(matchResult);
    }

    public Optional<MatchResult> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<MatchResult> updateUserProfile(long userId, MatchResult newMatchResult) {
        return collectionJudgeMinator.update(userId, newMatchResult);
    }
}

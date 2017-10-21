package dao;

import domain.Competition;
import utils.MongoCollectionX;

import java.util.Optional;

/**
 * Created by s_shchipanov.
 */
public class CompetitionDao {
    private MongoCollectionX<Long, Competition> collectionJudgeMinator;

    public CompetitionDao(MongoCollectionX<Long, Competition> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(Competition competition) {
        collectionJudgeMinator.insert(competition);
    }

    public Optional<Competition> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<Competition> updateUserProfile(long userId, Competition newCompetition) {
        return collectionJudgeMinator.update(userId, newCompetition);
    }
}

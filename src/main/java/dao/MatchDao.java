package dao;

import domain.Match;
import utils.MongoCollectionX;

import java.util.Optional;

/**
 * Created by SYShchipanov on 21.10.2017.
 */
public class MatchDao {

    private MongoCollectionX<Long, Match> collectionJudgeMinator;

    public MatchDao(MongoCollectionX<Long, Match> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(Match match) {
        collectionJudgeMinator.insert(match);
    }

    public Optional<Match> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<Match> updateUserProfile(long userId, Match newMatch) {
        return collectionJudgeMinator.update(userId, newMatch);
    }
}

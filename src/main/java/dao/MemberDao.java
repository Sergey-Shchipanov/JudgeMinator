package dao;

import domain.Member;
import utils.MongoCollectionX;

import java.util.Optional;

/**
 * Created by s_shchipanov.
 */
public class MemberDao {

    private MongoCollectionX<Long, Member> collectionJudgeMinator;

    public MemberDao(MongoCollectionX<Long, Member> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(Member member) {
        collectionJudgeMinator.insert(member);
    }

    public Optional<Member> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<Member> updateUserProfile(long userId, Member newMember) {
        return collectionJudgeMinator.update(userId, newMember);
    }
}

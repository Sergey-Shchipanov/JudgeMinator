package dao;

import domain.Order;
import utils.MongoCollectionX;

import java.util.Optional;

/**
 * Created by s_shchipanov.
 */
public class OrderDao {
    private MongoCollectionX<Long, Order> collectionJudgeMinator;

    public OrderDao(MongoCollectionX<Long, Order> collectionJudgeMinator) {
        this.collectionJudgeMinator = collectionJudgeMinator;
    }

    public void create(Order order) {
        collectionJudgeMinator.insert(order);
    }

    public Optional<Order> find(long id) {
        return collectionJudgeMinator.find(id);
    }

    public void deleteById(long id) {
        collectionJudgeMinator.delete(id);
    }

    public Optional<Order> updateUserProfile(long userId, Order newOeOrder) {
        return collectionJudgeMinator.update(userId, newOeOrder);
    }
}

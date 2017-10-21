package utils;


import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.List;
import java.util.Optional;

public class MongoCollectionX<TId, TValue> {

    private final MongoCollection<TValue> mongoCollection;


    public MongoCollectionX(MongoCollection<TValue> mongoCollection) {
        this.mongoCollection = mongoCollection;
    }

    public void insert(TValue entity) {
        mongoCollection.insertOne(entity);
    }

    public void insert(List<TValue> entities) {
        mongoCollection.insertMany(entities);
    }

    public Optional<TValue> find(TId id) {
        return Optional.ofNullable(mongoCollection.find(new Document("_id", id)).first());
    }

    public Optional<TValue> find(Bson filter) {
        return Optional.ofNullable(mongoCollection.find(filter).first());
    }

    public FindIterable<TValue> findAll() {
        return mongoCollection.find();
    }

    public FindIterable<TValue> findAll(Bson filter) {
        return mongoCollection.find(filter);
    }

    public void delete(TId id) {
        mongoCollection.findOneAndDelete(new Document("_id", id));
    }

    public void delete(Bson filter) {
        mongoCollection.findOneAndDelete(filter);
    }

    public Optional<TValue> update(TId id, TValue entity) {
        return Optional.ofNullable(mongoCollection.findOneAndReplace(new Document("_id", id), entity));
    }

    public UpdateResult update(Bson filter, Bson forUpdate) {
        return mongoCollection.updateMany(filter, forUpdate);
    }
}

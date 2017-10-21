package utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

public class MongoCollectionX<TId, TValue> {

    private final MongoCollection<TValue> mongoCollection;


    public MongoCollectionX(MongoCollection<TValue> mongoCollection) {
        this.mongoCollection = mongoCollection;
    }

    public void insert(TValue entity) throws JsonProcessingException {
        mongoCollection.insertOne(entity);
    }

    public TValue find(TId id) throws JsonProcessingException {
        return mongoCollection.find(new Document("_id", id)).first();
    }



}

package utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class MongoCollectionJudgeMinator<TId, TValue> {

    private MongoCollection<TValue> mongoCollection;
    private ObjectMapper objectMapper;


    public MongoCollectionJudgeMinator(MongoCollection mongoCollection) {
        this.mongoCollection = mongoCollection;
        objectMapper = new ObjectMapper();
    }

    public void insert(TValue entity) throws JsonProcessingException {
        mongoCollection.insertOne(entity);
    }

    public TValue find(TId id) throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        return mongoCollection.find(new Document("_id", id)).first();
    }

}

package dao;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import domain.UserProfile;
import org.mongojack.JacksonDBCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.net.UnknownHostException;

/**
 * @author anshipanov
 */
@Repository
public class UserProfileDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public UserProfileDao() {
        System.out.println("DAO");
    }

    public void create(UserProfile userProfile) {
        DBCollection dbCollection = getCollection();
        JacksonDBCollection<UserProfile, String> coll = JacksonDBCollection.wrap(dbCollection, UserProfile.class,
                String.class);
        coll.insert(userProfile);
    }

    public UserProfile find(long id) {
        return mongoTemplate.findById(id, UserProfile.class);
    }

    private static DBCollection getCollection() {
        MongoClient mongoClient = null;
        mongoClient = new MongoClient( "localhost" , 27017 );
        DB db = mongoClient.getDB( "jack" );
        DBCollection dbCollection = db.getCollection("test");
        return dbCollection;
    }

}

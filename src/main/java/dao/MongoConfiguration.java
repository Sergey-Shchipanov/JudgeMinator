package dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import domain.UserProfile;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import utils.JacksonCodecProvider;
import utils.MongoCollectionX;
import utils.ObjectMapperFactory;

/**
 * @author anshipanov
 */
@Configuration
public class MongoConfiguration {

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        return new SimpleMongoDbFactory(mongoClient, "judgeminator");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

    @Bean
    public MongoClient mongoClient() throws Exception {
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(MongoClient.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(new JacksonCodecProvider(ObjectMapperFactory.createObjectMapper())));

        MongoClientOptions clientOptions = MongoClientOptions.builder()
                .codecRegistry(codecRegistry)
                .build();
        return new MongoClient("localhost" , clientOptions);
    }

    @Bean
    public UserProfileDao userProfileDao(MongoClient mongoClient) {
        return new UserProfileDao(
                new MongoCollectionX<>(
                        mongoClient.getDatabase("judgeminator").getCollection("profile", UserProfile.class)
                )
        );
    }
}

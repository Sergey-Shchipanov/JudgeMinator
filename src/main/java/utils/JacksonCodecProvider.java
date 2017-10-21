package utils;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * @author anshipanov
 */
public class JacksonCodecProvider implements CodecProvider {
    private final ObjectMapper bsonObjectMapper;

    public JacksonCodecProvider(final ObjectMapper bsonObjectMapper) {
        this.bsonObjectMapper = bsonObjectMapper;
    }

    @Override
    public <T> Codec<T> get(final Class<T> type, final CodecRegistry registry) {
        return new JacksonCodec<>(bsonObjectMapper, registry, type);
    }
}
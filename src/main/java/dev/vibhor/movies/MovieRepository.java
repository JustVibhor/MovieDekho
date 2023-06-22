package dev.vibhor.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//let the framework know this is the repository
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}

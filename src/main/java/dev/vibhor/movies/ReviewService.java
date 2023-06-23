package dev.vibhor.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

//    using template to talk to a database for complex operations
//    we can form new dynamic query and do the job inside the database without using the repository
    @Autowired
    private MongoTemplate mongoTemplate;

//    first we will look for the movie with imdbId and then create new review and associate with foundMovie
    public Review createReview(String reviewBody, String imdbId) {

        Review review = reviewRepository.insert(new Review(reviewBody));

//        what we are trying to do?
//        using template to perform update on Movie class:
//        we will update movie with imdbId same as given by the user
//        then we will apply new update in reviewIds with value review
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}

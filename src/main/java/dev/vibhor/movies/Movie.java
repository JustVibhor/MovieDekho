package dev.vibhor.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

//represents each document in the movies collection
@Document(collection = "movies")
//takes care for all the getters setter and other toString methods
@Data
//constructor takes all these private fields
@AllArgsConstructor
//constructor which takes no parameters
@NoArgsConstructor
public class Movie {

//   id becomes the unique identifier for each movies
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

//    store only ids of reviews
    @DocumentReference
    private List<Review> reviewIds;


}

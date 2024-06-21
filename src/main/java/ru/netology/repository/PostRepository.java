package ru.netology.repository;

import ru.netology.model.Post;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

// Stub
public class PostRepository {
  public List<Post> all() {
    return List.of(
            new Post(1, "First"),
            new Post(2, "Second")
    );
  }

  public Optional<Post> getById(long id) {
    return Optional.empty();
  }

  public Post save(Post post) {
    return post;
  }

  public void removeById(long id) {
  }
}

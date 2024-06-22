package ru.netology.repository;

import ru.netology.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    List<Post> all();

    List<Post> reallyAll();

    Optional<Post> getById(long id);

    Optional<Post> reallyGetById(long id);

    Post save(Post post);

    void removeById(long id);
}
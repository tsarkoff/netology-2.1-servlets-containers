package ru.netology.repository;

import ru.netology.model.Post;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class PostRepository {
    private final Map<Long, Post> posts = new ConcurrentHashMap<>();
    private long postCount;

    public PostRepository() {
        posts.putAll(Map.ofEntries(
                Map.entry(1L, new Post(1, "First")),
                Map.entry(2L, new Post(2, "Second")),
                Map.entry(3L, new Post(3, "Third")),
                Map.entry(4L, new Post(4, "Fourth"))
        ));
        postCount = 4;
    }

    public Map<Long, Post> all() {
        return posts;
    }

    public Optional<Post> getById(long id) {
        return Optional.ofNullable(posts.get(id));
    }

    public Post save(Post post) {
        if (post.getId() == 0 || !posts.containsValue(post))
            posts.put(postCount, post.setId(++postCount));
        return post;
    }

    public void removeById(long id) {
        posts.remove(id);
        postCount--;
    }
}

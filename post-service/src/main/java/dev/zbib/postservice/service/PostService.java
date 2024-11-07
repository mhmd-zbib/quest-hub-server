package dev.zbib.postservice.service;

import dev.zbib.postservice.model.entity.Post;
import dev.zbib.postservice.model.request.PostRequest;
import dev.zbib.postservice.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void createPost(PostRequest request) {
        Long userId = request.getUserId();
        Long fieldId = request.getFieldId();
        Long domainId = request.getDomainId();
        Long topicId = request.getTopicId();    
        String content = request.getContent();


        Post post = Post.builder()
                .content(content)
                .fieldId(fieldId)
                .domainId(domainId)
                .topicId(topicId)
                .userId(userId)
                .build();
        postRepository.save(post);
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id)
                .orElse(null);
    }
}



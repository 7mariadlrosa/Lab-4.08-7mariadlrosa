package controller.interfaces;

import model.Post;

import java.util.List;

public interface IPostController {

    //GET AUTHOR AND POST
    public List<Object[]> findPostAndAuthor(Long id);

    //CREATE POST
    public Post addNewPost(Post post);

    //UPDATE POST
    public void updatePostInformation(Long id, Post post);

    //DELETE POST
    public void deletePost(Long id);
}

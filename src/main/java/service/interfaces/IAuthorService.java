package service.interfaces;

import model.Author;

public interface IAuthorService {

    //CREATE AUTHOR
    public Author addNewAuthor(Author author);

    //UPDATE AUTHOR
    public void updateAuthor(Long id, Author author);

    //DELETE AUTHOR
    public void deleteAuthor(Long id);
}

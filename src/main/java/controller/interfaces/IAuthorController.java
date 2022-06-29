package controller.interfaces;

import model.Author;
public interface IAuthorController {

    //ADD AUTHOR
    public Author addNewAuthor(Author author);

    //UPDATE AUTHOR
    public void updateAuthor(Long id, Author author);

    //DELETE AUTHOR
    public void deleteAuthor(Long id);
}

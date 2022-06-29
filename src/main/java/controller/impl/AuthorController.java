package controller.impl;

import controller.interfaces.IAuthorController;
import model.Author;
import service.interfaces.IAuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class AuthorController implements IAuthorController {

    @Autowired
    private IAuthorService authorService;

    //CREATE AUTHOR
    @PostMapping("/new-author")
    @ResponseStatus(HttpStatus.CREATED)
    public Author addNewAuthor(@RequestBody @Valid Author author) {
        return authorService.addNewAuthor(author);
    }

    //UPDATE AUTHOR
    @PutMapping("update-author/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateAuthor(@PathVariable Long id, @RequestBody @Valid Author author) {
        authorService.updateAuthor(id, author);
    }

    //DELETE AUTHOR
    @DeleteMapping("/delete-author/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }
}

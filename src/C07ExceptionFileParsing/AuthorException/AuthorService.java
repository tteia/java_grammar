package C07ExceptionFileParsing.AuthorException;

public class AuthorService {
    AuthorRepository authorRepository;
    AuthorService(){
        authorRepository = new AuthorRepository();
    }

    void register(String name, String email, String password){
        Author author = new Author(name, email, password);
        authorRepository.register(author);
    }
}


package pl.klewek.atipera.exception;

public class UsernameNotFoundException extends RuntimeException {
    public UsernameNotFoundException(String username) {
        super("Given username does not exist! " + username);
    }
}

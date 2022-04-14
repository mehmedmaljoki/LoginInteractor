package authorizer;

public interface Authorizer {
    public UserID authorize(String username, String password);
}

package test.authorizer;


import authorizer.Authorizer;
import authorizer.InvalidUserID;
import authorizer.UserID;

public class RejectingAuthorizerStub implements Authorizer {

    @Override
    public UserID authorize(String username, String password) {
        return new InvalidUserID();
    }
}

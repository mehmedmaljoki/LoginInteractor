package test.authorizer;

import authorizer.Authorizer;
import authorizer.UserID;

public class SubAuthorizer implements Authorizer {
    @Override
    public UserID authorize(String username, String password) {
        return new UserID(1);
    }
}

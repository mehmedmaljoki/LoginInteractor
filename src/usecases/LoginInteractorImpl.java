package usecases;

import authorizer.Authorizer;

public class LoginInteractorImpl implements LoginInteractor {
    private Authorizer authorizer;
    private UserGateway userGateway;

    public Authorizer getAuthorizer() {
        return authorizer;
    }

    public void setAuthorizer(Authorizer authorizer) {
        this.authorizer = authorizer;
    }
}

package test.usecases;


import usecases.LoginPresenter;
import usecases.LoginResponse;

public class LoginPresenterSpy implements LoginPresenter {
    private LoginResponse invokedResponse;

    @Override
    public void presentResponse(LoginResponse response) {
        invokedResponse = response;
    }

    public LoginResponse getInvokedResponse() {
        return invokedResponse;
    }
}

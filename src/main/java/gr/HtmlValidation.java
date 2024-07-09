package gr;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.List;

@Named("v")
@RequestScoped
public class HtmlValidation {

    /**
     * Used by tags/errors.html
     */
    public List<String> getErrorMessages(String errorFields, String validationKeys) {
        return null;
    }

    /**
     * Used by tags/errors.html
     */
    public boolean ifElementHasError(String errorFields, String validationKeys) {
        return false;
    }
}
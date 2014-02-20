package pl.com.turski.hermes.server.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pl.com.turski.hermes.server.model.Address;

/**
 * User: Adam
 */
public class AddressValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Address.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Address address = (Address) target;

        if (address == null) {
            errors.reject("Nie przekazano adresu");
            return;
        }

        String street = address.getStreet();
        if (street == null || street.isEmpty()) {
            errors.rejectValue("street", "Pole wymagane");
        }else if(street.length() < 3 ){
            errors.rejectValue("street", "Nazwa ulicy nie może być krótsza niż 3 znaki");
        }
    }
}

package pl.com.turski.hermes.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pl.com.turski.hermes.web.model.RegisterShipmentForm;

/**
 * User: Adam
 */
public class RegisterShipmentValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return RegisterShipmentForm.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RegisterShipmentForm request = (RegisterShipmentForm) target;
        String recipient = request.getRecipient();

        if (recipient == null || recipient.isEmpty()) {
            errors.rejectValue("recipient", "Pole nie może być puste");
        } else if (recipient.length() < 1 || recipient.length() > 255) {
            errors.rejectValue("recipient", "Długość pola nie może być mniejsza niż 1 oraz większa niż 255");
        }


    }
}

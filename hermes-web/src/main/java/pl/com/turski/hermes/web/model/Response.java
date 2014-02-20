package pl.com.turski.hermes.web.model;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Adam
 */
public class Response<T>
{
	private Status status;
	private T data;
	private Map<String, String> validationErrors;

	public Response( final T data )
	{
		this.status = Status.OK;
		this.data = data;
	}

	public Response( final Map<String, String> validationErrors )
	{
		this.status = Status.VALIDATION_FAILED;
		this.validationErrors = validationErrors;
	}

	public Response( final Errors errors )
	{
		this.status = Status.VALIDATION_FAILED;
		if(errors!=null && errors.hasErrors()){
			this.validationErrors = new HashMap<>(  );
			for( FieldError fieldError : errors.getFieldErrors() )
			{
				validationErrors.put( fieldError.getField(),fieldError.getDefaultMessage() );
			}
		}
	}
}

package example.training.model.fandamental.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
	code = HttpStatus.BAD_REQUEST
)
public class ResourceNotFoundException extends RuntimeException{
	public ResourceNotFoundException() {
	}
}

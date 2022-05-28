package br.com.freshdesk.freshdesk.controllers.exception;



import javax.servlet.http.HttpServletRequest;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<StandardError> constraintViolationException (HttpServletRequest request){

		HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
		StandardError err = new StandardError();
		err.setError("Violação de integridade");
		//err.setMessage(e.toString());
		err.setMessage("Já existe um cadastro com esse ticket_id");
		err.setStatus(status.value());

		return ResponseEntity.status(status).body(err);
		
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<StandardError> httpMessageNotReadableException (HttpServletRequest request){

		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError();
		err.setError("Formato invalido");
		err.setMessage("Json informado, está no formato invalido");
		err.setStatus(status.value());

		return ResponseEntity.status(status).body(err);
		
	}
	

}

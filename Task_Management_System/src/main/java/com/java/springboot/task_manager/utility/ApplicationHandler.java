package com.java.springboot.task_manager.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.java.springboot.task_manager.exception.AddCategoryNotCreatedException;
import com.java.springboot.task_manager.exception.AddpriorityNotFoundException;
import com.java.springboot.task_manager.exception.AssignedUsersForTaskNotFoundByException;
import com.java.springboot.task_manager.exception.AuthenticationFailedException;
import com.java.springboot.task_manager.exception.CategoryNotFoundException;
import com.java.springboot.task_manager.exception.CategoryNotUpdatedException;
import com.java.springboot.task_manager.exception.DeletePriorityNotFoundException;
import com.java.springboot.task_manager.exception.DeleteTaskSystemNotFoundException;
import com.java.springboot.task_manager.exception.IncorrectpasswordException;
import com.java.springboot.task_manager.exception.ListOfPriorityNotFoundException;
import com.java.springboot.task_manager.exception.ListOfTaskNotFoundException;
import com.java.springboot.task_manager.exception.ListOfTaskSystemNotFoundException;
import com.java.springboot.task_manager.exception.ListOfUserNotFoundByException;
import com.java.springboot.task_manager.exception.PriorityByIdNotFoundException;
import com.java.springboot.task_manager.exception.PriorityNotUpdateByIdNotFoundException;
import com.java.springboot.task_manager.exception.RemoveUserFromTaskNotFoundByException;
import com.java.springboot.task_manager.exception.TaskForUserNotFoundByException;
import com.java.springboot.task_manager.exception.TaskNotCreatedException;
import com.java.springboot.task_manager.exception.TaskNotDeletedException;
import com.java.springboot.task_manager.exception.TaskNotFoundByIdException;
import com.java.springboot.task_manager.exception.TaskNotFoundByPriorityException;
import com.java.springboot.task_manager.exception.TaskNotUpdatedByIdException;
import com.java.springboot.task_manager.exception.TaskSystemByIdNotFoundException;
import com.java.springboot.task_manager.exception.TaskSystemNotUpdateByIdNotFoundException;
import com.java.springboot.task_manager.exception.UpdateCategoryByIdNotFoundException;
import com.java.springboot.task_manager.exception.UserEmailNotFoundByException;
import com.java.springboot.task_manager.exception.UserNotCreatedException;
import com.java.springboot.task_manager.exception.UserNotDeleteByIdException;
import com.java.springboot.task_manager.exception.UserNotFoundByIdException;
import com.java.springboot.task_manager.exception.UserNotFoundByUsernameException;
import com.java.springboot.task_manager.exception.UserNotFoundByassingTaskException;
import com.java.springboot.task_manager.exception.UserNotUpdatedByIdException;


@RestControllerAdvice
public class ApplicationHandler {

	//	task Exception Start
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> taskNotCreatedException(TaskNotCreatedException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("Task not Created Succsefully");
		return new ResponseEntity<ErrorStructure<String>>(errorStructure, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> taskNotFoundByIdException(TaskNotFoundByIdException ex) {
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("Task not found ,Id Is Not Exist");
		return new ResponseEntity<ErrorStructure<String>>(errorStructure, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> taskNotFoundByPriorityException(TaskNotFoundByPriorityException ex) {
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("Task not found By Priority");
		return new ResponseEntity<ErrorStructure<String>>(errorStructure, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> TaskNotUpdatedByIdException(TaskNotUpdatedByIdException ex) {
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("Task not Updated By Id successfully");
		return new ResponseEntity<ErrorStructure<String>>(errorStructure, HttpStatus.NOT_FOUND);
	}

	public ResponseEntity<ErrorStructure<String>> taskNotDeletedException(TaskNotDeletedException ex) {
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("Task not Deleted  successfully");
		return new ResponseEntity<ErrorStructure<String>>(errorStructure, HttpStatus.NOT_FOUND);
	}	

	public ResponseEntity<ErrorStructure<String>> listOfTaskNotFoundException(ListOfTaskNotFoundException ex) {
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("List of Task Not Found successfully");
		return new ResponseEntity<ErrorStructure<String>>(errorStructure, HttpStatus.NOT_FOUND);
	}

	//	task  exception end




	//	taskSystem exception start
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> taskSystemByIdNotFoundException(TaskSystemByIdNotFoundException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("category By Id Not Found ");
		return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> taskSystemNotUpdateByIdNotFoundException(TaskSystemNotUpdateByIdNotFoundException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("username is not correct ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> DeleteTaskSystemNotFoundException(DeleteTaskSystemNotFoundException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("category Not updated ");
		return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> listOfTaskSystemNotFoundException(ListOfTaskSystemNotFoundException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("category Not deleted ");
		return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
	}
	//taskSystem exception end

	//	user Exception Start 
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> userNotCreatedException(UserNotCreatedException ex) {
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("User not Created Succsefully ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> userNotFoundByIdException(UserNotFoundByIdException ex) {
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("User not found ,Id Is Not Exist");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> userNotUpdatedByIdException(UserNotUpdatedByIdException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("User not Updated with id");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> userNotDeleteByIdException(UserNotDeleteByIdException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("User not Deleted Successfully ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> authenticationFailedException(AuthenticationFailedException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("Login Failed ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> userNotFoundByUsernameException(UserNotFoundByUsernameException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("username is not correct ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> incorrectpasswordException(IncorrectpasswordException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("username is not correct ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> taskForUserNotFoundByException(TaskForUserNotFoundByException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("username is not correct ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> userNotFoundByassingTaskException(UserNotFoundByassingTaskException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("username is not correct ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> assignedUsersForTaskNotFoundByException(AssignedUsersForTaskNotFoundByException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("username is not correct ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> removeUserFromTaskNotFoundByException(RemoveUserFromTaskNotFoundByException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("username is not correct ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> userEmailNotFoundByException(UserEmailNotFoundByException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("username is not correct ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> listOfUserNotFoundByException(ListOfUserNotFoundByException ex){
		ErrorStructure<String> errorStructure = new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(ex.getMessage());
		errorStructure.setErrordata("username is not correct ");
		return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

	}

	//	user Exception end

	

	//CategoryApplicationHandler start
		@ExceptionHandler
		public ResponseEntity<ErrorStructure<String>> updateCategoryByIdNotFoundException(UpdateCategoryByIdNotFoundException ex){
			ErrorStructure<String> errorStructure = new ErrorStructure<>();
			errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			errorStructure.setErrorMessage(ex.getMessage());
			errorStructure.setErrordata("category By Id Not Found ");
			return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
		}

		@ExceptionHandler
		public ResponseEntity<ErrorStructure<String>> addCategoryNotCreatedException(AddCategoryNotCreatedException ex){
			ErrorStructure<String> errorStructure = new ErrorStructure<>();
			errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			errorStructure.setErrorMessage(ex.getMessage());
			errorStructure.setErrordata("username is not correct ");
			return new ResponseEntity<>(errorStructure, HttpStatus.NOT_FOUND);

		}

		@ExceptionHandler
		public ResponseEntity<ErrorStructure<String>> categoryNotUpdatedException(CategoryNotUpdatedException ex){
			ErrorStructure<String> errorStructure = new ErrorStructure<>();
			errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			errorStructure.setErrorMessage(ex.getMessage());
			errorStructure.setErrordata("category Not updated ");
			return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
		}

		@ExceptionHandler
		public ResponseEntity<ErrorStructure<String>> categoryNotFoundException(CategoryNotFoundException ex){
			ErrorStructure<String> errorStructure = new ErrorStructure<>();
			errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			errorStructure.setErrorMessage(ex.getMessage());
			errorStructure.setErrordata("category Not deleted ");
			return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
		}

		//Category    ApplicationHandler end

//		Priority        ApplicationHandler exception start
		@ExceptionHandler
		public ResponseEntity<ErrorStructure<String>> addpriorityNotFoundException(AddpriorityNotFoundException ex){
			ErrorStructure<String> errorStructure = new ErrorStructure<>();
			errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			errorStructure.setErrorMessage(ex.getMessage());
			errorStructure.setErrordata("category Not deleted ");
			return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
		}

		@ExceptionHandler
		public ResponseEntity<ErrorStructure<String>> priorityByIdNotFoundException(PriorityByIdNotFoundException ex){
			ErrorStructure<String> errorStructure = new ErrorStructure<>();
			errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			errorStructure.setErrorMessage(ex.getMessage());
			errorStructure.setErrordata("category Not deleted ");
			return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler
		public ResponseEntity<ErrorStructure<String>> priorityNotUpdateByIdNotFoundException(PriorityNotUpdateByIdNotFoundException ex){
			ErrorStructure<String> errorStructure = new ErrorStructure<>();
			errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			errorStructure.setErrorMessage(ex.getMessage());
			errorStructure.setErrordata("category Not deleted ");
			return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler
		public ResponseEntity<ErrorStructure<String>> deletePriorityNotFoundException(DeletePriorityNotFoundException ex){
			ErrorStructure<String> errorStructure = new ErrorStructure<>();
			errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			errorStructure.setErrorMessage(ex.getMessage());
			errorStructure.setErrordata("category Not deleted ");
			return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler
		public ResponseEntity<ErrorStructure<String>> listOfPriorityNotFoundException(ListOfPriorityNotFoundException ex){
			ErrorStructure<String> errorStructure = new ErrorStructure<>();
			errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
			errorStructure.setErrorMessage(ex.getMessage());
			errorStructure.setErrordata("category Not deleted ");
			return new ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
		}
		
//		PriorityApplicationHandler exception end




}

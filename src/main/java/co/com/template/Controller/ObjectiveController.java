package co.com.template.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.template.Repository.Domain.ObjectiveDomain;
import co.com.template.services.ObjectiveService;
//import co.com.template.Repository.ObjectiveRepositoryUpdate;
import co.com.template.util.exception.NullTemplateException;
import co.com.template.util.exception.TemplateNotFoundException;


@RestController
@RequestMapping("/objective")
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE,
		RequestMethod.OPTIONS, RequestMethod.HEAD, RequestMethod.PATCH, RequestMethod.TRACE }, allowedHeaders = "*")


public class ObjectiveController {
	
	@Autowired
	private ObjectiveService ObjectiveService;
	//private ObjectiveRepositoryUpdate ObjectiveRepositoryUpdate; 
	
	@GetMapping
	public ResponseEntity<Object> getObjective(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(ObjectiveService.GetObjective());
		} catch (NullTemplateException exception) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
		} catch (TemplateNotFoundException exception) {
			return ResponseEntity.status(HttpStatus.OK).body(exception.getMessage());
		}
	}
	
	@PutMapping
	public ResponseEntity<Object> setObjective(@RequestBody ObjectiveDomain objective){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(ObjectiveService.SetObjective(objective));
		}catch (NullTemplateException exception) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
		}catch(TemplateNotFoundException exception) {
			return ResponseEntity.status(HttpStatus.OK).body(exception.getMessage());
		}
	}
	
	@PutMapping("{objective_id}")
	public ResponseEntity<Object> UpdateObjective(@PathVariable int objective_id, @RequestBody ObjectiveDomain objective){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(ObjectiveService.UpdateObjective(objective));
		}catch (NullTemplateException exception) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
		}catch(TemplateNotFoundException exception) {
			return ResponseEntity.status(HttpStatus.OK).body(exception.getMessage());
		}
	}
	
	/*
	@PutMapping("{objective_id}")
	public ResponseEntity<Object> UpdateObjective(@PathVariable String objective_id, @RequestBody ObjectiveDomain objective){
		System.out.print("Hola "+objective_id);
		ObjectiveDomain objectives = ObjectiveRepositoryUpdate.findById(objective_id);
		if(objectives == null) {
			return ResponseEntity.notFound().build();
		}
		
		objectives.setObjective_describe(objective.getObjective_describe());
		objectives.setObjective_objective_type_id(objective.getObjective_objective_type_id());
		objectives.setObjective_user_id(objective.getObjective_user_id());
		objectives.setObjective_grupo_id(objective.getObjective_grupo_id());
		objectives.setObjective_status_id(objective.getObjective_status_id());
		
		ObjectiveRepositoryUpdate.updateObjectiveDetails(
				objectives.getObjective_describe()
				, objectives.getObjective_objective_type_id()
				, objectives.getObjective_user_id()
				, objectives.getObjective_grupo_id()
				, objectives.getObjective_status_id()
				);
		
		return ResponseEntity.ok(objectives);
	}
	*/
	@DeleteMapping("{objective_id}")

	public ResponseEntity<Object> deleteObjective(@PathVariable Long objective_id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(ObjectiveService.DeleteObjective(objective_id));
		} catch (NullTemplateException exception) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
		} catch (TemplateNotFoundException exception) {
			return ResponseEntity.status(HttpStatus.OK).body(exception.getMessage());
		}
	}
	
}

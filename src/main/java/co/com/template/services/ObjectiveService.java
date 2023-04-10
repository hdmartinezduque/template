package co.com.template.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.template.Repository.Domain.ObjectiveDomain;
import co.com.template.Repository.Domain.StatusDomain;
import co.com.template.Repository.ObjectiveRepository;
import co.com.template.util.exception.NullTemplateException;
import co.com.template.util.exception.TemplateNotFoundException;

@Service
@Transactional

public class ObjectiveService {

	@Autowired
	private ObjectiveRepository ObjectiveDao;

	
	public Object GetObjective() throws NullTemplateException, TemplateNotFoundException {
		List<ObjectiveDomain> response = (List<ObjectiveDomain>) ObjectiveDao.findAll();
		if (response == null || response.isEmpty()) {
			return new StatusDomain("BLANK", "Operacion No se encontraron datos");
			
		}
		return response;
	}
	
	public ObjectiveDomain SetObjective(ObjectiveDomain objective) throws NullTemplateException, TemplateNotFoundException {
		ObjectiveDomain response = ObjectiveDao.save(objective);
		return response;
	}
	
	
	public ObjectiveDomain UpdateObjective(ObjectiveDomain objective) throws NullTemplateException, TemplateNotFoundException {
		ObjectiveDomain response = ObjectiveDao.save(objective);
		return response;
		//return null;
	}
	
	
	public StatusDomain DeleteObjective(Long id) throws NullTemplateException, TemplateNotFoundException {
	
		ObjectiveDao.deleteById(id);
		StatusDomain response = new StatusDomain();
		response.setMessage("successful Process");
		response.setResponse("successful");
	
		return response;

	}


	
	/*
	public ObjectiveDomain UpdateObjective(String id) throws NullTemplateException, TemplateNotFoundException {
		Optional<ObjectiveDomain> response = ObjectiveDao.findById(id);
		//response.setMessage("successful Process");
		//response.setResponse("successful");
		ObjectiveDomain.getObjective_describe();

		return null;
	}
	*/
	
}

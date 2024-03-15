package com.java.springboot.task_manager.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.java.springboot.task_manager.entity.Priority;
import com.java.springboot.task_manager.exception.AddpriorityNotFoundException;

import com.java.springboot.task_manager.exception.DeletePriorityNotFoundException;

import com.java.springboot.task_manager.exception.ListOfPriorityNotFoundException;
import com.java.springboot.task_manager.exception.PriorityByIdNotFoundException;
import com.java.springboot.task_manager.exception.PriorityNotUpdateByIdNotFoundException;
import com.java.springboot.task_manager.repository.PriorityRepository;
import com.java.springboot.task_manager.service.PriorityService;
import com.java.springboot.task_manager.utility.ResponseStructure;

@Service
public class PriorityServiceImpl implements PriorityService {

	@Autowired
	private PriorityRepository priorityRepository;
	
	@Override
	public ResponseEntity<ResponseStructure<Priority>> addPriority(Priority priority) {
		Priority savePriority =priorityRepository.save(priority);
		if(savePriority == null) {
			throw new AddpriorityNotFoundException(" Failed to add priority");
		}
		else {
			ResponseStructure<Priority> responseStructure =new ResponseStructure<>();
			responseStructure.setStatuscode(HttpStatus.CREATED.value());
			responseStructure.setMessage("category add successfully");
			responseStructure.setData(savePriority);		
			return new ResponseEntity<ResponseStructure<Priority>>(responseStructure,HttpStatus.CREATED);

		}
	}

	@Override
	public Priority getPriorityById(int priorityId)  {

		Optional<Priority> priorityOptional =priorityRepository.findById(priorityId);
		if(priorityOptional.isPresent()) {
			return priorityOptional.get();
		}
		else {
			throw new PriorityByIdNotFoundException("Priority by id not found");
		}
	}

	@Override
	public Priority updatePriority(int priorityId,Priority updatePriority) {
		Optional<Priority> optionalPriority = priorityRepository.findById(priorityId);
		if(optionalPriority.isPresent()) {
			Priority exixtingPriority = optionalPriority.get();
			exixtingPriority.setPriorityId(updatePriority.getPriorityId());

			return priorityRepository.save(exixtingPriority);
		}
		throw new PriorityNotUpdateByIdNotFoundException(" ");

	}

	@Override
	public Priority deletePriority(int priorityId) {
		Optional<Priority> optionalPriority = priorityRepository.findById(priorityId);
		if (optionalPriority.isPresent()) {
			Priority deletePriority = optionalPriority.get();
			priorityRepository.delete(deletePriority);
			return deletePriority;
		} 
		else {
			throw new DeletePriorityNotFoundException("priority not found by ID: ");

		}

	}


	@Override
	public ResponseEntity<ResponseStructure<List<Priority>>> getAllPriorities(){
		List<Priority> priorityList = priorityRepository.findAll(); 
		if(priorityList.isEmpty()) {
			throw new ListOfPriorityNotFoundException(" List of category");
		}
		else {
			ResponseStructure<List<Priority>> responseStructure =new ResponseStructure<>();
			responseStructure.setStatuscode(HttpStatus.FOUND.value());
			responseStructure.setMessage("get all the task ");
			responseStructure.setData(priorityList);
            return new ResponseEntity<ResponseStructure<List<Priority>>>(responseStructure,HttpStatus.FOUND);
		}
	}
}

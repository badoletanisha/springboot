package com.jsp.springboot.actor.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jsp.springboot.actor.exception.NotFoundActorById;
import com.jsp.springboot.actor.model.Actor;
import com.jsp.springboot.actor.repository.ActorRepository;
import com.jsp.springboot.actor.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService{

	@Autowired
	private ActorRepository actorRepository;
////	@Override
////	public Actor addActor(String actor) {
////		return actorRepository.save(actor);
////	}
//	@Override
//	public Actor findByActorId(int actorId){
//		Optional<Actor> byId = actorRepository.findById(actorId);
//
//		if(byId.isPresent()) {
//			Actor actor =byId.get();
//			return actor;
//		}else {
//			throw new NotFoundActorById("Actor Not Found");
//		}
//
//	}
//	@Override
//	public Actor updateByActorId(int actorId , Actor updatedActor) {
//		Optional<Actor> optional =actorRepository.findById(actorId);
//
//		if(optional.isPresent()){
//			Actor existingActor = optional.get();
//			updatedActor.setActorId(existingActor.getActorId());
//			return actorRepository.save(updatedActor);
//		}
//		return null;
//	}
//	@Override
//	public Actor deleteActorById(int actorId) {
//
//		Optional<Actor> optional = actorRepository.findById(actorId);
//
//		if(optional.isPresent()) {
//			Actor deleteActor = optional.get();
//			actorRepository.delete(deleteActor);
//			return deleteActor;
//		}
//		else {
//			return null;
//		}
//	}
//	@Override
//	public Actor findAllActor() {
//		List<Actor> actorList = actorRepository.findAll();
//
//		if(actorList.isEmpty()) {
//			return null;
//		}
//		else {
//			return null;
//		}
//	}
	public Actor findByActorName(String name){
		Optional<Actor> optionalActor = actorRepository.findByName(name);

		if(optionalActor.isPresent()) {
			Actor actor =optionalActor.get();
			return actor;
		}else {
			throw new NotFoundActorById("Actor Not Found");
		}

	}
	
	
}
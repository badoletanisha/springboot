package com.jsp.springboot.actor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.jsp.springboot.actor.model.Actor;
import com.jsp.springboot.actor.service.ActorService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class ActorContoller {
@Autowired
private ActorService actorService; 

//@RequestMapping(method = RequestMethod.GET,value = "/print")
//public String print(@RequestParam String name,@RequestParam String city) {
//	return name+" belongs to "+city;
//	
//}
//
//@RequestMapping(method = RequestMethod.POST , value = "/actors/addActor")
//public  Actor addActor(@RequestBody Actor actor) {
//	return actorService.addActor(actor);
//	
////}
//@RequestMapping(method = RequestMethod.GET,value = "/actors/findByActorId")
//public Actor findByActorId(@RequestParam int actorId) {
//	return actorService.findByActorId(actorId);
//	
//}
//@RequestMapping(method = RequestMethod.PUT,value = "/actors/updateByActorId")
//public Actor updateByActorId(@RequestParam int actorId,@RequestBody Actor actor) {
//	return actorService.updateByActorId(actorId, actor);
//	
//}
//@RequestMapping(method = RequestMethod.DELETE,value = "/actors/deleteActorById")
//public Actor deleteActorById(@RequestParam int actorId) {
//	return actorService.deleteActorById(actorId);
//	
//}
//
//@RequestMapping(method = RequestMethod.GET,value = "/actors/findAllActor")
//public Actor findAllActor() {
//	return actorService.findAllActor();
//	
//}

//
//@GetMapping("/actors/findByActorName")
//public Actor findByActorName(@RequestParam String actorName) {
//	return actorService.findByActorName(actorName);
//}

@RequestMapping(method = RequestMethod.GET,value = "/actors/findByActorName")
public Actor findByActorName(@RequestParam String name) {
	return actorService.findByActorName(name);
	
}
//	optional --> is class which has 3 method present in it 1)isPresent() 2)isEmpty() 3)get()
//	1) isPresent return the object value 2)isEmpty return the null value
}

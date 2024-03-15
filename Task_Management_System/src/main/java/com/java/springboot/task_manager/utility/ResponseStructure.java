package com.java.springboot.task_manager.utility;



import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;

import com.java.springboot.task_manager.entity.Task;
import com.java.springboot.task_manager.entity.TaskSystem;



@ResponseBody
public class ResponseStructure<T> {
	private int statuscode;
	private String Message;
	private T data;
	private List<Task> listOfTask;
	private List<TaskSystem> taskSystemList;
	private TaskSystem saveTaskSystem;

	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public List<Task> getListOfTask() {
		return listOfTask;
	}
	public void setListOfTask(List<Task> listOfTask) {
		this.listOfTask = listOfTask;
	}
	
	public List<TaskSystem> getTaskSystemList() {
		return taskSystemList;
	}
	public void setTaskSystemList(List<TaskSystem> taskSystemList) {
		this.taskSystemList = taskSystemList;
	}
	
	public TaskSystem getSaveTaskSystem() {
		return saveTaskSystem;
	}
	
	public void setSaveTaskSystem(TaskSystem saveTaskSystem) {
		// TODO Auto-generated method stub
		this.saveTaskSystem=saveTaskSystem;
	}
	
	
	
	
		
	
	
}

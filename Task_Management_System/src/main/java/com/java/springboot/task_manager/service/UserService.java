package com.java.springboot.task_manager.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.java.springboot.task_manager.entity.Task;
import com.java.springboot.task_manager.entity.User;
import com.java.springboot.task_manager.utility.ResponseStructure;

public interface UserService {
public ResponseEntity<ResponseStructure<User>> createUser(User user);
public User getUserById(int userId);
public User updateUser(int userId,User updatedUser);
public User deleteUser(int userId);
public User getUserByUsername(String username, String password);
public User assignTask(int userId, int taskId);
public List<Task> getTasksForUser(int userId);
public Set<User> getAssignedUsersForTask(int taskId);
public User removeUserFromTask(int userId, int taskId);
public User getUserByEmail(String email);
public ResponseEntity<ResponseStructure<List<User>>> getAllUsers();
//public User loginUser(String username, String password);

}
/*
 * User Management Operations:
createUser(UserDTO userDTO): Method to create a new user based on user data transfer object (DTO).
getUserById(Long userId): Method to retrieve a user by their unique identifier.
updateUser(UserDTO userDTO): Method to update an existing user's information based on user DTO.
deleteUser(Long userId): Method to delete a user by their unique identifier.
Authentication and Authorization:
authenticate(String username, String password): Method to authenticate a user by their username and password.
getUserByUsername(String username): Method to retrieve a user by their username for authentication purposes.
grantRole(Long userId, Role role): Method to grant a role to a user.
revokeRole(Long userId, Role role): Method to revoke a role from a user.
User Relationship Management:
assignTask(Long userId, Long taskId): Method to assign a task to a user.
getTasksForUser(Long userId): Method to retrieve tasks assigned to a specific user.
getAssignedUsersForTask(Long taskId): Method to retrieve users assigned to a specific task.
removeUserFromTask(Long userId, Long taskId): Method to remove a user from a task.
User Information Retrieval:
getUserByEmail(String email): Method to retrieve a user by their email address.
getAllUsers(): Method to retrieve all users in the system.
User Preferences and Settings:
updateUserPreferences(Long userId, UserPreferencesDTO preferencesDTO): Method to update user preferences.
getUserSettings(Long userId): Method to retrieve user-specific settings.
 */
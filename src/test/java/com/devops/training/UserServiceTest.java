package com.devops.training;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Optional;

public class UserServiceTest {
    
    private UserService userService;
    
    @Before
    public void setUp() {
        userService = new UserService();
    }
    
    @Test
    public void testAddUser() {
        User user = new User("john_doe", "john@example.com", "John Doe");
        userService.addUser(user);
        
        assertEquals(1, userService.getUserCount());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddNullUser() {
        userService.addUser(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddUserWithEmptyUsername() {
        User user = new User("", "john@example.com", "John Doe");
        userService.addUser(user);
    }
    
    @Test
    public void testFindUserByUsername() {
        User user = new User("jane_doe", "jane@example.com", "Jane Doe");
        userService.addUser(user);
        
        Optional<User> found = userService.findUserByUsername("jane_doe");
        assertTrue(found.isPresent());
        assertEquals("jane@example.com", found.get().getEmail());
    }
    
    @Test
    public void testFindNonExistentUser() {
        Optional<User> found = userService.findUserByUsername("unknown");
        assertFalse(found.isPresent());
    }
    
    @Test
    public void testDeleteUser() {
        User user = new User("bob", "bob@example.com", "Bob Smith");
        userService.addUser(user);
        
        assertTrue(userService.deleteUser("bob"));
        assertEquals(0, userService.getUserCount());
    }
    
    @Test
    public void testGetAllUsers() {
        userService.addUser(new User("user1", "user1@example.com", "User One"));
        userService.addUser(new User("user2", "user2@example.com", "User Two"));
        
        assertEquals(2, userService.getAllUsers().size());
    }
}

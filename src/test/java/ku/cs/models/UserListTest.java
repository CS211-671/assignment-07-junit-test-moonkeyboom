package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList userList;

    @BeforeEach
    void init() {
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("Mook", "Jong");
        userList.addUser("Fern", "Noui");
        userList.addUser("Pim", "Nanna");

        // TODO: find one of them
        String expected = "Mook";
        User user = userList.findUserByUsername("Mook");
        String actual = user.getUsername();

        // TODO: assert that UserList found User
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanxord() {
        // TODO: add 3 users to UserList
        userList.addUser("Mook", "Jong");
        userList.addUser("Fern", "Noui");
        userList.addUser("Pim", "Nanna");
        // TODO: change password of one user
        User user = userList.findUserByUsername("Fern");
        boolean actual;
        actual = userList.changePassword("Mook","Jong", "Mew");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Mook", "Jong");
        userList.addUser("Fern", "Noui");
        userList.addUser("Pim", "Nanna");
        // TODO: call login() with correct username and password
        User actual = userList.login("Mook", "Jong");
        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("Mook");
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Mook", "Jong");
        userList.addUser("Fern", "Noui");
        userList.addUser("Pim", "Nanna");
        // TODO: call login() with incorrect username or incorrect password
        User actual;
        actual = userList.login("Mook", "Jing");
        // TODO: assert that the method return null
         assertNull(actual);
    }

}
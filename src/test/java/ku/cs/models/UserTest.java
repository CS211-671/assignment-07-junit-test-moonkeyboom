package ku.cs.models;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void init(){
        user = new User("Mook", "Jong");
    }

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    @DisplayName("test getUserName()")
    void testGetUsername() {
        assertEquals("Mook", user.getUsername());
    }

    @Test
    @DisplayName("test IsUserName()")
    void testIsUsername() {
        assertTrue(user.isUsername("Mook"));
        assertFalse(user.isUsername(""));
    }

    @Test
    @DisplayName("check validatePassword and setPassword")
    void testValidatePassword() {
        user.setPassword("moo");
        assertTrue(user.validatePassword("moo"));
    }

    @Test
    void testSetPassword() {
    }


}
package com.library.app.service;

import java.util.List;
import java.util.Optional;

import com.library.app.persistence.model.User;
import com.library.app.web.dto.UserDto;

public interface IUserService {

    User registerNewUserAccount(UserDto accountDto);

    //User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    //void createVerificationTokenForUser(User user, String token);

    //VerificationToken getVerificationToken(String VerificationToken); Im not operating with tokens yet

    //VerificationToken generateNewVerificationToken(String token);

    //void createPasswordResetTokenForUser(User user, String token);

    User findUserByEmail(String email);

    //PasswordResetToken getPasswordResetToken(String token);

    //Optional<User> getUserByPasswordResetToken(String token);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    //String validateVerificationToken(String token);

    //String generateQRUrl(User user) throws UnsupportedEncodingException;

    //User updateUser2FA(boolean use2FA);

    List<String> getUsersFromSessionRegistry();

    //NewLocationToken isNewLoginLocation(String username, String ip);

    //String isValidNewLocationToken(String token);

    void addUserLocation(User user, String ip);
}

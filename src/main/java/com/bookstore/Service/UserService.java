package com.bookstore.Service;

import com.bookstore.domain.User;
import com.bookstore.domain.security.PasswordResetToken;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
		// TODO Auto-generated method st
	
	void createPasswordResetTokenForUser(final User user, final String token);

}

package com.clozanoga.financeapp.manager;

import com.clozanoga.financeapp.domain.Portfolio;
import com.clozanoga.financeapp.domain.User;

public interface UserService {
	
	User saveUser(User newUser);
	
	Portfolio addPortfolioToUser(User user, Portfolio portfolio);
	
	User getUser(String username);
	
}

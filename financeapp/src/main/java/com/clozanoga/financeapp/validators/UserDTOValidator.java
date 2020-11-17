package com.clozanoga.financeapp.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.clozanoga.financeapp.dtos.UserDTO;

@Component
public class UserDTOValidator implements Validator {
	
	@Override
    public boolean supports(Class<?> aClass) {
        return UserDTO.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {

        UserDTO userDTO = (UserDTO) object;
        
        if(!userDTO.getPassword().equals(userDTO.getConfirmPassword())){
            errors.rejectValue("confirmPassword","Match", "Passwords must match");
        }
    }
}

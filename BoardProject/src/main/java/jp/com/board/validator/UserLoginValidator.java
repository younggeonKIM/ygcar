package jp.com.board.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import jp.com.board.model.UserLoginModel;

public class UserLoginValidator implements Validator {
	
	private static final int MINIMUM_PASSWORD_LENGTH = 6;
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserLoginModel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pwd", "field.required");
		UserLoginModel login = (UserLoginModel)target;
		if(login.getPwd() != null && login.getPwd().trim().length()<MINIMUM_PASSWORD_LENGTH) {
			errors.rejectValue("pwd", "field.min.length", new Object[] {Integer.valueOf(MINIMUM_PASSWORD_LENGTH)}, "認証番号は必ず" + MINIMUM_PASSWORD_LENGTH + "以上の文字数を持たなければなりません");
		}
	}

}

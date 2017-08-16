package br.com.utils.colluradeveloper.mylibrary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidEmailFormat {
        private boolean isValid = false;



        /// --- VERIFY EMAIL FORMAT
        public Boolean test(String email) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            CharSequence inputStr = email;

            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(inputStr);
            if (matcher.matches()) {
                isValid = true;
            }
            return isValid;
        }

}

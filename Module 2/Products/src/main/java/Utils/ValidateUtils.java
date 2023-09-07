package Utils;

import java.util.regex.Pattern;

public class ValidateUtils {
    public static final String REGEX_ID = "^[1-9]\\d*$";
    public static final String FIELD_ID = "id";
    public static final String FIELD_ID_MESSAGE = "Id phải là số nguyên dương";
    public static final String REGEX_NAME = "^[a-zA-Z0-9\\s_-]{1,100}$";
    public static final String FIELD_NAME = "tên";
    public static final String FIELD_NAME_MASSAGE = "Tên có từ 1 - 100 kí tự và không chứa kí tự đặc biệt";
    public static final String REGEX_DESCRIPTION = "^[a-zA-Z0-9\\s_.-]{1,100}$";
    public static final String FIELD_DESCRIPTION = "mô tả";
    public static final String FIELD_DESCRIPTION_MESSAGE = "Mô tả có từ 1 - 100 kí từ và không chứa kí tự đặc biệt";
    public static final String REGEX_PRICE = "^\\d{4,}(\\.\\d+)?$";
    public static final String FIELD_PRICE = "giá";
    public static final String FIELD_PRICE_MASSAGE = "Giá tối thiểu 4 chữ số";
    public static final String REGEX_QUANTITY = "^[1-9]\\d*$";
    public static final String FIELD_QUANTITY = "số lượng";
    public static final String FIELD_QUANTITY_MESSAGE ="Số lượng phải là 1 số nguyên dương không bao gồm số 0";


//    public static boolean isValidName(String strName){
//        return Pattern.matches(REGEX_NAME, strName);
//    }
//    public static boolean isValidPhone(String strPhone){
//        return Pattern.matches(REGEX_PHONE,strPhone);
//    }
//    public static boolean isValidDOB(String strDOB){
//        return Pattern.matches(REGEX_DOB, strDOB);
//    }
//    public static boolean isValidUsername(String strUsername){
//        return Pattern.matches(REGEX_USERNAME,strUsername);
//    }
//    public static boolean isValidPassword(String strPassword){
//        return Pattern.matches(REGEX_PASSWORD,strPassword);
//    }
    public static boolean isValid(String strPattern, String strInput){
        return Pattern.matches(strPattern,strInput);
    }
}

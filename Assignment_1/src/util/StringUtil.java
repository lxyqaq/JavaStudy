package util;

/**
 * @ClassName StringUtil
 * @Description String string to judge empty and non-empty
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/1 17:10
 * @Version 1.0
 */
public class StringUtil {

    /**
     * @param str
     * @return true:String is empty false:String is not empty
     * @description The realization of the method to judge the string is empty
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 16:17
     */
    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param str
     * @return true:String is not empty false:String is empty
     * @description The realization of the method to judge the string is not empty
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 16:19
     */
    public static boolean isNotEmpty(String str) {
        if (str != null && !"".equals(str.trim())) {
            return true;
        } else {
            return false;
        }
    }

}

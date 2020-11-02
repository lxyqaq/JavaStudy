package util;

/**
 * @ClassName StringUtil
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/1 17:10
 * @Version 1.0
 */
public class StringUtil {

    public static boolean isEmpty(String str){
        if(str==null || "".equals(str.trim())){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isNotEmpty(String str){
        if(str!=null && !"".equals(str.trim())){
            return true;
        }else{
            return false;
        }
    }

}

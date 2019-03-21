package shop.api.web.rest.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;

import shop.api.web.rest.common.Contants;
import shop.api.web.rest.common.ResponseCommon;

/**
 * The Class Utils.
 *
 * @author datnt
 */
public class Utils {


    /**
     * Get timezone of JP.
     *
     * @param pattern the pattern
     * @return the full current date string
     */
    public static String getCuretntDateString(String pattern) {

        String currentDay = Contants.CONST_STR_BLANK;

        if (pattern != null && !pattern.isEmpty()) {
            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(Contants.CONST_STR_TIMEZONE_JP));
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            sdf.setTimeZone(TimeZone.getTimeZone(Contants.CONST_STR_TIMEZONE_JP));
            currentDay = sdf.format(cal.getTime());
        }

        return currentDay;
    }

    /**
     * Convert time to date.
     *
     * @author VuDA
     * @param time the time
     * @return the date
     */
    public static Date convertTimeToDate(long time) {
        Date date = new Date(time);
        return date;
    }

    /**
     * Get timezone of JP.
     *
     * @param pattern the pattern
     * @return the full current date string
     */
    public static Date getCurrentDate(String pattern) {

        Date date = null;
        if (pattern != null && !pattern.isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            try {
                date = sdf.parse(getCuretntDateString(pattern));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return date;
    }

    /**
     * Gets the message with code.
     *
     * @author VuDA
     * @param messageCode the message code
     * @return the message with code
     * @throws Exception the exception
     */
    public static String getMessageWithCode(String messageCode) throws Exception {

        InputStream utf8in = ResponseCommon.class.getClassLoader().getResourceAsStream("i18n/messages.properties");
        Reader reader = new InputStreamReader(utf8in, Contants.CONST_STR_ENCODING_UTF8);
        Properties props = new Properties();
        props.load(reader);

        return props.getProperty(messageCode);
    }


    /**
     * Gets the email from current login.
     *
     * @author VuDA
     * @param data the data
     * @return the email from current login
     */
    public static String[] getEmailFromCurrentLogin(String data) {

        if(data != null && !data.isEmpty() && data.indexOf(Contants.CONST_STR_HASH_TAG) != -1) {
            String[] dataArr = data.split(Contants.CONST_STR_HASH_TAG);
            if(dataArr.length >= 3) {
                return dataArr;
            }
        }

        return new String[] {Contants.CONST_STR_BLANK, Contants.CONST_STR_BLANK, Contants.CONST_STR_ZERO};
    }

    /**
     * Get user id from current login.
     *
     * @author datnt
     * @param data the data
     * @return object user id
     */
//    public static Integer getUserIdFromCurrentLogin(String data) {
//        return stringToInteger(getEmailFromCurrentLogin(data)[0]);
//    }

    /**
     * Create folder (directory).
     *
     * @author datnt
     * @param path the path
     * @param folderName the folder name
     * @return true if create success. <br>
     *         false if path is file or catch a exception.
     */
//    public static boolean createFolder(String path, String folderName) {
//
//        if (StringValidation.isBlank(path, folderName)) {
//            return false;
//        }
//
//        try {
//
//            File file = Paths.get(path, folderName).toFile();
//
//            if (!file.isDirectory()) {
//                file.mkdirs();
//            }
//            return true;
//        } catch (Exception e) {}
//
//        return false;
//    }

    /**
     * Save file with data is a base64 string.
     *
     * @author datnt
     * @param parent the parent
     * @param fileName the file name
     * @param base64Data the base 64 data
     * @return true if save success, else return false.
     */
//    public static boolean saveFileBase64String(String parent, String fileName, String base64Data) {
//
//        if (StringValidation.isBlank(parent, fileName, base64Data)) {
//            return false;
//        }
//
//        try {
//            Path path = Paths.get(parent, fileName);
//            // Convert base64 string to byte array
//            byte[] bytes = Base64.decodeBase64(base64Data);
//
//            if (bytes.length < getUnallocateSpace(parent)) {
//                FileUtils.writeByteArrayToFile(path.toFile(), bytes);
//                return path.toFile().isFile();
//            }
//        } catch (Exception e) {}
//
//        return false;
//    }

    /**
     * Load file.
     *
     * @author datnt
     * @param parent the parent
     * @param fileName the file name
     * @return resource of file, null if file not exist or catch exception
     * @throws FileNotFoundException the file not found exception
     */
//    public static Resource downloadFile(String parent, String fileName) throws FileNotFoundException {
//
//        if (StringValidation.isBlank(parent, fileName)) {
//            return null;
//        }
//
//        try {
//
//            Path path = Paths.get(parent.trim(), fileName.trim());
//
//            Resource resource = new UrlResource(path.toUri());
//
//            if (resource.exists() || resource.isReadable()) {
//                return resource;
//            }
//        } catch (Exception e) {}
//
//        return null;
//    }

 
}

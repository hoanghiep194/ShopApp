package shop.api.web.rest.common;


import java.util.HashMap;
import java.util.Map;

import shop.api.web.rest.util.ApiResponseUtil;
import shop.api.web.rest.util.Utils;


/**
 * The Class ResponseCommon.
 */
public class ResponseCommon {

    /**
     * Creates the response.
     *
     * @param data the data
     * @param message the message
     * @return the map
     * @throws Exception
     */
    public static Map<String, Object> createResponse(Object data, String messageCode) throws Exception {

        Map<String, Object> response = new HashMap<>();

        ApiResponseUtil resultData = new ApiResponseUtil();
        resultData.setResultData(data);
        resultData.setMessage(Utils.getMessageWithCode(messageCode));
        response.put(Contants.CONST_STR_RESPONSE, resultData);

        return response;
    }

    /**
     * Creates the response error.
     *
     * @param errorCode the error code
     * @return the api response util
     * @throws Exception the exception
     */
    public static ApiResponseUtil createResponseError(String errorCode) throws Exception {

        ApiResponseUtil response = new ApiResponseUtil();
        response.setErrorCode(errorCode);
        response.setMessage(Utils.getMessageWithCode(errorCode));

        return response;
    }

    /**
     * Creates error data for response.
     *
     * @param title the title
     * @param errorCode the error code
     * @return the map
     * @throws Exception the exception
     */
    public static Map<String, Object> createMapResponseError(String errorCode) throws Exception {

        ApiResponseUtil errorResponse = createResponseError(errorCode);

        Map<String, Object> response = new HashMap<>();
        response.put(Contants.CONST_STR_RESPONSE, errorResponse);

        return response;

    }

    /**
     * Create error data for response.
     *
     * @param title the title
     * @param errorCode the error code
     * @param itemNameCode the item name code
     * @return the map
     * @throws Exception the exception
     */
    public static Map<String, Object> createMapResponseError(String itemNameCode, String errorCode) throws Exception {

        // Create message from item code and error code
        String message = Utils.getMessageWithCode(errorCode).replace(
                Contants.CONST_STR_ITEM_NAME_MESSAGE,
                Utils.getMessageWithCode(itemNameCode)
            );

        // Set up message and error code
        ApiResponseUtil errorResponse = new ApiResponseUtil();
        errorResponse.setErrorCode(errorCode);
        errorResponse.setMessage(message);

        // Create map of response
        Map<String, Object> response = new HashMap<>();
        response.put(Contants.CONST_STR_RESPONSE,
                     errorResponse);

        return response;
    }
}

package lubskiy.va.booking_service.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ErrorResponse(
        LocalDateTime timestamp,
        int status,
        String errorCode,
        String message,
        String path,
        Map<String, String> fieldErrors
) {
    public static ErrorResponse of(int status, String errorCode, String message, String path) {
        return new ErrorResponse(LocalDateTime.now(), status, errorCode, message, path, null);
    }

    public static ErrorResponse ofValidation(int status, String message, String path,
                                             Map<String, String> fieldErrors) {
        return new ErrorResponse(LocalDateTime.now(), status, "VALIDATION_FAILED",
                message, path, fieldErrors);
    }
}
package lubskiy.va.booking_service.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public static ResourceNotFoundException room(Long id) {
        return new ResourceNotFoundException("Room with id " + id + " not found");
    }
}

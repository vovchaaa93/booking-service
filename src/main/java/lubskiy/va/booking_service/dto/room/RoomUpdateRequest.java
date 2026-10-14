package lubskiy.va.booking_service.dto.room;

import jakarta.validation.constraints.*;

public record RoomUpdateRequest(
        @NotBlank(message = "Room name must not be blank")
        @Size(max = 100, message = "Room name must not exceed 100 characters")
        String name,

        @NotNull(message = "Capacity is required")
        @Min(value = 1, message = "Capacity must be at least 1")
        @Max(value = 200, message = "Capacity must not exceed 200")
        Integer capacity,

        @NotNull(message = "Floor is required")
        @Min(value = -5, message = "Floor is invalid")
        @Max(value = 100, message = "Floor is invalid")
        Integer floor,

        @NotNull(message = "hasProjector flag is required")
        Boolean hasProjector,

        @NotNull(message = "hasWhiteboard flag is required")
        Boolean hasWhiteboard
) {
}

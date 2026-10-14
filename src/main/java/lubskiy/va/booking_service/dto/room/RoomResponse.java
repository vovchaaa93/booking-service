package lubskiy.va.booking_service.dto.room;

public record RoomResponse(
        Long id,
        String name,
        Integer capacity,
        Integer floor,
        Boolean hasProjector,
        Boolean hasWhiteboard
) {
}

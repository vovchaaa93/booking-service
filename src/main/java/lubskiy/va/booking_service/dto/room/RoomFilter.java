package lubskiy.va.booking_service.dto.room;

public record RoomFilter(
    Integer minCapacity,
    Integer floor,
    Boolean hasProjector,
    Boolean hasWhiteboard
){}

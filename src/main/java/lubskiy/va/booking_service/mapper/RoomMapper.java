package lubskiy.va.booking_service.mapper;

import lubskiy.va.booking_service.dto.room.RoomCreateRequest;
import lubskiy.va.booking_service.dto.room.RoomResponse;
import lubskiy.va.booking_service.entity.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {
    public Room toEntity(RoomCreateRequest request) {
        return Room.builder()
                .name(request.name())
                .capacity(request.capacity())
                .floor(request.floor())
                .hasProjector(request.hasProjector())
                .hasWhiteboard(request.hasWhiteboard())
                .build();
    }

    public void updateEntity(Room entity, RoomCreateRequest request) {
        entity.setName(request.name());
        entity.setCapacity(request.capacity());
        entity.setFloor(request.floor());
        entity.setHasProjector(request.hasProjector());
        entity.setHasWhiteboard(request.hasWhiteboard());
    }

    public RoomResponse toResponse(Room entity) {
        return new RoomResponse(
                entity.getId(),
                entity.getName(),
                entity.getCapacity(),
                entity.getFloor(),
                entity.getHasProjector(),
                entity.getHasWhiteboard()
        );
    }
}

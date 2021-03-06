package com.se.recommendation.inventory;


import com.se.recommendation.inventory.model.Room;

/**
 * DTO object for {@link Room}s.
 *
 * @author
 */
public class RoomDTO {

    private long id;
    private String name;
    private long roomCategoryId;
    private String description;

    public RoomDTO(Room room) {
        this.id = room.getId();
        this.name = room.getName();
        this.roomCategoryId = room.getRoomCategory().getId();
        this.description = room.getDescription();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getRoomCategoryId() {
        return roomCategoryId;
    }

    public String getDescription() {
        return description;
    }
}

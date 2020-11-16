package com.se.recommendation.inventory.controller;


import com.se.recommendation.inventory.RoomDTO;
import com.se.recommendation.inventory.model.Room;
import com.se.recommendation.inventory.model.RoomCategory;
import com.se.recommendation.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Resource (controller) class for {@link Room}s.
 *
 * @author Ludovic Dewailly
 */
@RestController
@RequestMapping("/rooms")
public class RoomsResource {

    @Autowired
    private InventoryService inventoryService;

    public RoomsResource() {
    }

    @RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
    public RoomDTO getRoom(@PathVariable("roomId") long id) {
        Room room = inventoryService.getRoom(id);
        return new RoomDTO(room);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<RoomDTO> getRoomsInCategory(@RequestParam("categoryId") long categoryId) {
        RoomCategory category = inventoryService.getRoomCategory(categoryId);
        return inventoryService.getAllRoomsWithCategory(category)
                .stream().map(RoomDTO::new).collect(Collectors.toList());
    }
}

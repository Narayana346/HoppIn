package com.hoppin.service;

import com.hoppin.dto.HotelPriceDto;
import com.hoppin.dto.HotelSearchRequest;
import com.hoppin.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}

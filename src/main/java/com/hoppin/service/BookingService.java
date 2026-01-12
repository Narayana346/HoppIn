package com.hoppin.service;

import com.hoppin.dto.BookingDto;
import com.hoppin.dto.BookingRequest;
import com.hoppin.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}

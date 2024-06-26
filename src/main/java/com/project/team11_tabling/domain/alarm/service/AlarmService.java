package com.project.team11_tabling.domain.alarm.service;

import com.project.team11_tabling.domain.booking.entity.BookingType;
import com.project.team11_tabling.global.event.AlarmEvent;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public interface AlarmService {

  SseEmitter subscribe(Long userId, BookingType bookingType);

  void sendMessage(AlarmEvent alarmEvent);

}

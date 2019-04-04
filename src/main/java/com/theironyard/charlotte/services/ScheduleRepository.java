package com.theironyard.charlotte.services;

import com.theironyard.charlotte.entities.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ScheduleRepository extends CrudRepository<Schedule, Integer> {
    List<Schedule> findByHomeOrAway(String teamAbreviation, String something);
    List<Schedule> findByDayOfYear(int dayOfYear);
    Schedule findById(String id);
}

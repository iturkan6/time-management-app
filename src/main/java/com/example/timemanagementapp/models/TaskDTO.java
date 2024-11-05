package com.example.timemanagementapp.models;

import java.time.LocalTime;
import java.util.List;

public record TaskDTO(
        DaysOfWeek weekDay,
        LocalTime start,
        LocalTime end,
        List<String> tag,
        String comment
) {
}

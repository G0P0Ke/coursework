package com.andreev.coursework.service.participant;

import com.andreev.coursework.dto.CourseDto;
import com.andreev.coursework.dto.ProfileDto;
import com.andreev.coursework.entity.Participant;

import java.util.List;

public interface ParticipantService {

    Participant findByMail(String email);

    void loginUser(String email);

    List<Participant> getAllUsers();

    void saveUser(Participant user);

    void updateProfileUser(Participant participant, ProfileDto profileDto);

    void addCourse(Participant participant, CourseDto courseDto);

    Participant getUser(int id);

    void deleteUser(int id);

    boolean isActive(String email, String code);
}

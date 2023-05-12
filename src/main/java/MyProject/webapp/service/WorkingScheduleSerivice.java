package MyProject.webapp.service;

import MyProject.webapp.exception.DataNotFoundException;
import MyProject.webapp.exception.GeneralException;
import MyProject.webapp.modle.request.ScheduleForUserForm;
import MyProject.webapp.modle.response.schedule.ScheduleUserDetailResponse;
import MyProject.webapp.modle.response.schedule.ScheduleUserResponse;

import java.security.GeneralSecurityException;
import java.util.List;

public interface WorkingScheduleSerivice {
    List<ScheduleUserResponse> getUserSchedule(String startDate, String endDate) throws GeneralException;

    ScheduleUserDetailResponse getUserScheduleDetai(Long scheduleId) throws GeneralException;

    void deleteUserSchedule(Long scheduleId) throws GeneralException;

    ScheduleUserDetailResponse addScheduleForUser(ScheduleForUserForm scheduleForUserForm) throws DataNotFoundException;

    ScheduleUserDetailResponse updateScheduleForUser(ScheduleForUserForm scheduleForUserUpdateForm) throws DataNotFoundException, GeneralException;
}
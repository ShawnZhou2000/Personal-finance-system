package com.qlu.keshe.dto;

import java.util.Date;

/**
 * @author：TuoJun
 * @date：2020/06/12 15:22
 * Description：
 */
public class DateDto {

    private Date startTime;
    private Date endTime;

    public DateDto() {
    }

    public DateDto(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}

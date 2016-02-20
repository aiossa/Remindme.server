package com.qoobico.remindme.server.controller;

import com.qoobico.remindme.server.entity.Remind;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Aleksandr on 24.01.2016.
 */

@RestController
@RequestMapping("/remind")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(){
        return createMockRemId();
    }

    private Remind createMockRemId() {
        Remind remind=new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date());
        remind.setTitle("First remind");
        return remind;
    }


}

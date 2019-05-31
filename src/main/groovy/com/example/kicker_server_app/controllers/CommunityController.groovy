package com.example.kicker_server_app.controllers

import java.util.logging.Logger
import com.example.kicker_server_app.models.Community
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CommunityController {

    private final Community community = new Community()
    private final logger = Logger.getLogger('')

    @RequestMapping("/api/community")
    List<String> community(@RequestParam(value = "usersOnline", defaultValue = "HelloWorldUser") List<String> usersOnline) {
        logger.info("Community -> usersOnline: ${community.usersOnline.toString()}")
        return community.usersOnline
    }

    @RequestMapping(value = "/api/community/addOnlineUser", method = RequestMethod.POST)
    @ResponseBody
    List<String> addOnlineUser(String user) {
        community.addOnlineUser(user)
        logger.info("Added user $user, Community -> usersOnline: ${community.usersOnline.toString()}")
        return community.usersOnline
    }

    @RequestMapping(value = "/api/community/removeOnlineUser", method = RequestMethod.POST)
    @ResponseBody
    List<String> removeOnlineUser(String user) {
        community.removeOnlineUser(user)
        logger.info( "Removed user $user, Community -> usersOnline: ${community.usersOnline.toString()}")
        return community.usersOnline
    }
}
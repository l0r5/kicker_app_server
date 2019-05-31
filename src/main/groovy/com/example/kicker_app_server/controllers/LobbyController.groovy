package com.example.kicker_app_server.controllers


import java.util.logging.Logger
import com.example.kicker_app_server.models.Lobby
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class LobbyController {

    private final Lobby lobby = new Lobby()
    private final logger = Logger.getLogger('')

    @RequestMapping("/api/lobby")
    List<String> community(@RequestParam(value = "usersOnline", defaultValue = "HelloWorldUser") List<String> usersOnline) {
        logger.info("Lobby -> usersOnline: ${lobby.usersOnline.toString()}")
        return lobby.usersOnline
    }

    @RequestMapping(value = "/api/lobby/addOnlineUser", method = RequestMethod.POST)
    @ResponseBody
    List<String> addOnlineUser(String user) {
        lobby.addOnlineUser(user)
        logger.info("Added user $user, Lobby -> usersOnline: ${lobby.usersOnline.toString()}")
        return lobby.usersOnline
    }

    @RequestMapping(value = "/api/lobby/removeOnlineUser", method = RequestMethod.POST)
    @ResponseBody
    List<String> removeOnlineUser(String user) {
        lobby.removeOnlineUser(user)
        logger.info( "Removed user $user, Lobby -> usersOnline: ${lobby.usersOnline.toString()}")
        return lobby.usersOnline
    }
}
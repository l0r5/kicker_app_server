package com.example.kicker_app_server.models

import java.util.logging.Logger

class Lobby {

    private final long id
    private final List<String> usersOnline

    private final logger = Logger.getLogger('')

    Lobby() {
        this.id = id
        this.usersOnline = []
    }

    List<String> getUsersOnline() {
        return usersOnline
    }

    void addOnlineUser(String user) {
        if(usersOnline.contains(user)) {
            logger.info("User $user is already member in the lobby.")
        } else {
            usersOnline.add(user)
        }
    }

    void removeOnlineUser(String user) {
        usersOnline.remove(user)
    }
}

package com.example.kicker_app_server.models

class Lobby {

    private final long id
    private final List<String> usersOnline

    Lobby() {
        this.id = id
        this.usersOnline = ['DummyUser']
    }

    List<String> getUsersOnline() {
        return usersOnline
    }

    void addOnlineUser(String user) {
        usersOnline.add(user)
    }

    void removeOnlineUser(String user) {
        usersOnline.remove(user)
    }
}

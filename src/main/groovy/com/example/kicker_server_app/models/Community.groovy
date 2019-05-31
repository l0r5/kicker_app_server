package com.example.kicker_server_app.models

class Community {

    private final long id
    private final List<String> usersOnline

    Community() {
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

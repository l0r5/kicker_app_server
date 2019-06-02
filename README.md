# kicker_app_server
SpringBoot App to handle KickerApp Requests

# Docker

Run dockerfile with following command:

`$ cd into the root project folder`


 - build a container

    `$ docker build -t kicker_app_server .`

  - run the container

    `$ docker run -p 8080:8080 kicker_app_server`

Check e.g. http://localhost:8080/api/lobby in your browser to validate the server is running.


Useful commands:

- sh into image

    `$ docker run -ti --entrypoint /bin/sh kicker_app_server`

    `$ ls`
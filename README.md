# Reposilite [![Docker Pulls](https://img.shields.io/docker/pulls/dzikoysk/reposilite.svg?label=pulls&logo=docker)](https://hub.docker.com/r/dzikoysk/reposilite) [![Reposilite CI](https://github.com/dzikoysk/reposilite/actions/workflows/maven.yml/badge.svg)](https://github.com/dzikoysk/reposilite/actions/workflows/maven.yml) [![codecov](https://codecov.io/gh/dzikoysk/reposilite/branch/master/graph/badge.svg?token=9flNHTSJpp)](https://codecov.io/gh/dzikoysk/reposilite) [![Language grade: JavaScript](https://img.shields.io/lgtm/grade/javascript/g/dzikoysk/reposilite.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/dzikoysk/reposilite/context:javascript) [![CodeFactor](https://www.codefactor.io/repository/github/dzikoysk/reposilite/badge/master)](https://www.codefactor.io/repository/github/dzikoysk/reposilite/overview/master) 

[Reposilite](https://reposilite.com) *(formerly NanoMaven)* - lightweight repository manager for Maven based artifacts. 
It is a simple solution to replace managers like Nexus, Archiva or Artifactory. 

![Preview](https://user-images.githubusercontent.com/4235722/83757901-7c96e300-a671-11ea-9881-f0b85f058a6c.png)

#### Installation
Website: [Reposilite](https://reposilite.com) <br>
Releases: [GitHub Downloads](https://github.com/dzikoysk/reposilite/releases) <br>
Docker Images: [DockerHub Repository](https://hub.docker.com/r/dzikoysk/reposilite) <br>
Demo: [repo.panda-lang.org](https://repo.panda-lang.org) <br>

Requirements: 
* Java 8+
* RAM 12MB+

| Amount | Description |
|:------:|-------------|
| *12MB* | Tiny repository for personal projects |
| *16MB* - *32MB* | *--------------------^------------------* + CI + Proxy |
| *48MB - 128MB* | Tiny public repository *(recommended)* |
| *128MB+* | Public repository | 

#### Publications
* [Reposilite - Official Guide](https://reposilite.com/docs/about)
* [Publishing your artifacts to the Reposilite - a new self-hosted repository manager ](https://dev.to/dzikoysk/publishing-your-artifacts-to-the-reposilite-a-new-self-hosted-repository-manager-3n0h)

#### Features
* [x] Working Maven repository manager *(example: [repo.panda-lang.org](https://repo.panda-lang.org))*
* [x] Support Maven, Gradle and SBT build tools
* [x] Docker image *(repository: [dzikoysk/reposilite](https://hub.docker.com/r/dzikoysk/reposilite))*
* [x] Authorization *(deploy and downloads)*
* [x] Deploy *(using tokens and BCrypt)*
* [x] [dependabot](https://dependabot.com/) supported
* [x] Supports distributed environments like [K8s](https://github.com/dzikoysk/reposilite/issues/251#issuecomment-698974936)
* [x] Multithreading
* [x] Proxy of other remote repositories
* [x] Supports requests to primary repository without its name in url
* [x] Dashboard
  * [x] Customizable front page
  * [x] Command line interface
  * [x] Repository browser
  * [x] Admin panel
* [x] Snapshots
* [x] Statistics
* [x] REST API
* [x] [OpenAPI with Swagger UI](https://repo.panda-lang.org/swagger)
* [x] 90%+ test coverage
* [x] Documentation

#### Stack
* Reposilite Backend: Java + Javalin (Jetty) + Groovy (JUnit)
* Reposilite Frontend: Vue.js + Pug + Stylus + Tailwindcss
* Reposilite Site: React.js + Docusaurus 

FROM ubuntu
MAINTAINER shanmukha shanmukha511@outlook.com
LABEL "IMAGE"="MY IMAGE"
USER root
RUN mkdir /maven1
RUN apt-get -y update && apt-get -y install default-jdk
COPY /tmp/workspace/pipeline/target/*.jar /maven1
CMD ["ls"]
#CMD pwd &&\
 #uptime &&\
 #whoami
#ENTRYPOINT ["ls"]-
#ARG JAVA_HOME=test
ENV JAVA_VERSION=2.0

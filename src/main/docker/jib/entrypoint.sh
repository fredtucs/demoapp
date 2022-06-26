#!/bin/sh
exec java $JAVA_OPTS -noverify -XX:+AlwaysPreTouch -Djava.security.egd=file:/dev/./urandom -cp @/app/jib-classpath-file @/app/jib-main-class-file
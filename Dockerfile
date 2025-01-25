# Tomcat 기반 컨테이너 사용
FROM tomcat:9-jdk17

# WAR 파일 복사 (Jenkins에서 빌드된 WAR 파일 사용)
COPY target/*.war /usr/local/tomcat/webapps/myapp.war

# Tomcat 8080 포트 노출222
EXPOSE 8080

# Tomcat 실행
CMD ["catalina.sh", "run"]

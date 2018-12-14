# spring_ha
Local Host 스프링 HA 구성 테스터 

# build 
각 프로젝트에서 빌드 후 아래와 같이 실행  
java -jar *.jar --spring.profiles.active=zone1
java -jar *.jar --spring.profiles.active=zone2

# 브라우저 
http://localhost:8081/simple-service/zone 


# 1. JDK17 이미지를 base image로 불러오기
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 app 생성
WORKDIR /app

# 3. 빌드된 jar파일을 build/libs 폴더에서 찾아서 컨테이너의 /app 폴더에 app.jar로 복사
COPY build/libs/*.jar app.jar

# 4. 컨테이너가 열 포트 설정
EXPOSE 8080

# 5. jar 실행 명령어
ENTRYPOINT [ "java", "-jar", "app.jar" ]

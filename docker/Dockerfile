# Використовуємо офіційний образ Java 11
FROM openjdk:11-jre-slim

# Створюємо робочу директорію в образі
WORKDIR /app

# Копіюємо JAR-файл вашого телеграм-бота в образ
COPY java-bot-0.0.1-SNAPSHOT.jar /app/java-bot-0.01-SNAPSHOT.jar

# Команда для запуску вашого телеграм-бота
CMD ["java", "-jar", "java-bot-0.0.1-SNAPSHOT.jar"]
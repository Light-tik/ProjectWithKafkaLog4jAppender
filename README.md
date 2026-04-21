# Kafka Log4j2 Appender Demo
Это тестовый проект, который будет писать логи с использованием моего аппендера
## Чтобы запустить и проверить работу, нужно в терминале ввести следующие команды:
1)Запуск
```bash
docker-compose up
``` 
2) Посмотреть список контейнеров
```bash
docker ps
```
3) Берём название контейнера с кафкой и вставляем в следующую команду
```bash
docker exec -it <имя_контейнера> kafka-console-consumer --bootstrap-server localhost:9092 --topic logs --from-beginning
```
4) Запускаем Spring приложение и проверяем логи

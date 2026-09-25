# ELK-стек для логирования Spring Boot приложения

## 📋 Описание задачи

Развернуть **ELK-стек** (Elasticsearch, Logstash, Kibana, Filebeat) с помощью 
**Docker Compose** и настроить запись и отображение логов из **Spring Boot** 
приложения.

## 🎯 Цель

Отработать:
- Развёртывание ELK-стека через Docker Compose;
- Настройку логирования в Spring Boot с **logstash-logback-encoder**;
- Отправку логов из приложения в ELK через **Filebeat**;
- Создание **index pattern** и работу с логами в **Kibana**;
- Сохранение данных Elasticsearch через **volume** (чтобы настройки Kibana сохранились).

## 🛠️ Используемые технологии

- Java 17+
- Spring Boot
- Logback + `logstash-logback-encoder`
- Docker / Docker Compose
- Elasticsearch, Logstash, Kibana, Filebeat (ELK-стек)

package ru.netology.demo_training_hw;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String makeLog() {
        logger.info("Целевое действие выполнено: привет, ELK!");
        logger.debug("Это отладочное сообщение");
        logger.error("Это ошибка для проверки");
        return "Лог записан";
    }
}

## Паттерн: Команда
## Предметная область: Умное устройство
Реализовать класс Connectivity для передачи комманд умному динамику, используя паттерн проектирования команда.

Реализовать методы для изменения громкости динамика (допустимые значения: 0-100%), изменение режима mute (допустимые значения: true/false), изменение состояния подсветки динамика (допустимые значения: on, off, blinking), изменение задержки выходного канала (допустимые значения: 0-1024 милисекунд).

Состояние девайса по умолчанию: громкость - 100%, режим mute - выключен, подсветка - выключена, задержка выходного канала 0 милисекунд.

Задайте задержку выходного канала 200 милисекунд, задайте мигающую подсветку, постепенно измените громкость девайса до 50% и через 2 включите режим mute.

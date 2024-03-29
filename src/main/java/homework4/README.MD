## Зависимости в тестах
### Задание 1. Ответьте письменно на вопросы:

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?<br><br>
    Ответ: Заглушка выступает в качестве небольшого фрагмента кода, который заменяет другой компонент во время тестирования.
    Одним из ключевых преимуществ использования заглушки является их способность постоянно возвращать результаты, что упрощает написание тестов.
    Даже если другие компоненты еще не полностью функциональны или недоступны, можно выполнять тесты с помощью заглушки. 
    А также использование заглушек повышает автономность теста и его гибкость, экономит память.<br><br>

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?<br><br>
   Ответ: Mock, который позволяет тесту проверять вывод.<br><br>

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?<br><br>
   Ответ: Stub. Для него задается готовый ответ на вызов метода.<br><br>

4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?<br><br>
   Ответ: Fake. Представляет собой упрощенную реализацию класса для имитации поведения основного класса.<br><br>

### Задание 2.

У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.

Формат сдачи: воспользуйтесь одним из вариантов: Ссылка на репозиторий Git или Прикрепленный архив

Письменное задание 1 можно также разместить в репозитории или разместить текстом в окне сдачи практического задания.
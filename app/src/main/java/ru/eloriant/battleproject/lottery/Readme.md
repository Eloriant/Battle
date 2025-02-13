### Описание задачи:

Дана комбинация из 5 чисел (например, `54789`). Несколько пользователей вводят свои варианты комбинации, и необходимо определить, кто угадал наибольшее количество чисел **подряд**, начиная с первого числа.

### Условия:

1. Основная комбинация всегда состоит из 5 чисел (например, `54789`).
2. Каждый пользователь вводит свою комбинацию, также состоящую из 5 чисел (например, `56789`).
3. Необходимо определить для каждого пользователя, сколько чисел подряд он угадал, начиная с первого числа.
4. Вернуть тех пользователей, которые угадали максимальное количество чисел подряд.

### Пример:

- Основная комбинация: `54789`
- Варианты пользователей:
    - Пользователь 1: `56789` — угадал только первое число.
    - Пользователь 2: `54789` — угадал все числа.
    - Пользователь 3: `54829` — угадал два числа (54).

### Задача:

1. Реализовать функцию, которая принимает:
    - основную комбинацию (список из 5 чисел),
    - список комбинаций пользователей (список списков по 5 чисел).
2. Функция должна вернуть пользователей, которые угадали максимальное количество чисел подряд, начиная с первого числа.

### Ожидаемый результат:

```kotlin
val mainCombination = listOf(5, 4, 7, 8, 9)
val userCombinations = listOf(
    listOf(5, 6, 7, 8, 9),  // Пользователь 1
    listOf(5, 4, 7, 8, 9),  // Пользователь 2
    listOf(5, 4, 8, 2, 9)   // Пользователь 3
)

val result = findBestUsers(mainCombination, userCombinations)
// Ожидаемый результат: Пользователь 2 угадал все 5 чисел, остальные меньше.

```

### Дополнительные задачи:

1. Если несколько пользователей угадали одно и то же количество чисел, вернуть всех таких пользователей.
2. Вернуть список пользователей с указанием места которое они заняли.
   Т.е есть два пользователя один угадал 5 чисел = занял первое место, второй угадал 2 числа = занял второе место
   Если пользователи угадали одинаковое количество чисел, они находятся на одном месте
3. Проанализировать производительность решения на большом количестве пользователей.
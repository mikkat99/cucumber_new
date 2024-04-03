#languege: ru
@all
@severity=normal
Feature: Проверка поиска товара


  Scenario Outline: Проверка поиска товара
    * Открытие меню 'Каталог'
    * Открытие раздела  "<chapter>" и проверка открытия
    * Открытие подраздела  "<subChapter>" и проверка открытия подраздела
    * Установка минимальной цены "<minPrice>"
    * Выбор производителя "<producerName>"
    * Проверка завершения загрузки
    * Проверить,что в поисковой выдаче не более 24 товаров
    * Ввод названия первого найденного товара в поисковую строку
    * Проверка количества товара в поисковой выдаче
    * Проверка, что наименование товара соответствует сохраненному значению

    Examples:
      | chapter              | subChapter | minPrice | producerName |
      | Комплектующие для ПК | Видеокарты | 20000    | Gigabyte    |
#      | Периферия            | Клавиатуры | 2000     | A4Tech       |
# Итоговая контрольная работа




Информация о проекте
Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.
Как сдавать проект
Для сдачи проекта необходимо создать отдельный общедоступный
репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом
репозитории, использовать пул реквесты на изменения. Программа должна
запускаться и работать, ошибок при выполнении программы быть не должно.
Программа, может использоваться в различных системах, поэтому необходимо
разработать класс в виде конструктора
Задание


***1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).***

![скрин](https://github.com/RomanStrashko/Final_work/blob/main/итоговая_1.png)

***2. Создать директорию, переместить файл туда.***

![скрин](https://github.com/RomanStrashko/Final_work/blob/main/итоговая_2.png)

![скрин](https://github.com/RomanStrashko/Final_work/blob/main/итоговая_2.1.png)
   
***3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.***

![скрин](https://github.com/RomanStrashko/Final_work/blob/main/итоговая_3.png)

![скрин](https://github.com/RomanStrashko/Final_work/blob/main/итоговая_3.1.png)

***4. Установить и удалить deb-пакет с помощью dpkg.***

![скрин](https://github.com/RomanStrashko/Final_work/blob/main/итоговая_4.png)

***5. Выложить историю команд в терминале ubuntu***

![скрин](https://github.com/RomanStrashko/Final_work/blob/main/итоговая_5.png)

![скрин](https://github.com/RomanStrashko/Final_work/blob/main/итоговая_5.1.png)

***6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).***

![скрин](https://github.com/RomanStrashko/Final_work/blob/main/Диаграмма.png)

***7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”***

CREATE DATABASE Human_friends;

***8. Создать таблицы с иерархией из диаграммы в БД***

USE Human_friends;

CREATE TABLE animals
(
	Id INT AUTO_INCREMENT PRIMARY KEY, 
	Class_name VARCHAR(20)
);

INSERT INTO animals (Class_name)
VALUES ('вьючные'),
('домашние');  


CREATE TABLE pack_animals
(
	  Id INT AUTO_INCREMENT PRIMARY KEY,
    Genus_name VARCHAR (20),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pack_animals (Genus_name, Class_id)
VALUES ('Лошади', 1),
('Ослы', 1),  
('Верблюды', 1); 
    
CREATE TABLE home_animals
(
	  Id INT AUTO_INCREMENT PRIMARY KEY,
    Genus_name VARCHAR (20),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO home_animals (Genus_name, Class_id)
VALUES ('Кошки', 2),
('Собаки', 2),  
('Хомяки', 2); 

CREATE TABLE cats 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES home_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE dogs 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES home_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE hamsters 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES home_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE horses 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES packed_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE donkeys 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES packed_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE camels 
(       
    Id INT AUTO_INCREMENT PRIMARY KEY, 
    Name VARCHAR(20), 
    Birthday DATE,
    Commands VARCHAR(50),
    Genus_id int,
    Foreign KEY (Genus_id) REFERENCES packed_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

***9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения***

INSERT INTO cats (Name, Birthday, Commands, Genus_id)
VALUES ('Мия', '2023-01-23', 'мяу', 1),
('Прошка', '2012-01-01', "кусь", 1),  
('Дымка', '2013-05-01', "пш-пш", 1);

INSERT INTO dogs (Name, Birthday, Commands, Genus_id)
VALUES ('Майла', '2020-01-01', 'ко мне,голос', 2),
('Джек', '20009-06-12', "сидеть, лежать,", 2),  
('Букет', '2010-05-01', "лапу, след, фас", 2), 

INSERT INTO hamsters (Name, Birthday, Commands, Genus_id)
VALUES ('Тики', '2020-10-12', 'грызть', 3),
('Гайка', '2019-03-12', "прыжок", 3),  
('Лайки', '2019-03-11', домик, 3), 

INSERT INTO horses (Name, Birthday, Commands, Genus_id)
VALUES ('Гром', '2020-01-12', 'бегом, шагом', 1),
('Закат', '2017-03-12', "бегом, стоп, хоп", 1),  
('Молния', '2020-11-10', "бегом, шагом", 1);


INSERT INTO donkeys (Name, Birthday, Commands, Genus_id)
VALUES ('Первый', '2019-04-10', Иа, 2),
('Второй', '2020-03-12', "стоять", 2),  
('Третий', '2021-07-12', "иди", 2), 



INSERT INTO camels (Name, Birthday, Commands, Genus_id)
VALUES ('Горб', '2022-04-10', 'плюнь', 3),
('Шнур', '2019-03-12', "лежать", 3),  
('Смарт', '2012-07-12', "повернись", 3), 

***10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.***

SET SQL_SAFE_UPDATES = 0;
DELETE FROM camels;

SELECT Name, Birthday, Commands FROM horses
UNION SELECT  Name, Birthday, Commands FROM donkeys;

***11.Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице***

CREATE TEMPORARY TABLE animals AS

SELECT *, 'Лошади' as genus FROM horses

UNION SELECT *, 'Ослы' AS genus FROM donkeys

UNION SELECT *, 'Собаки' AS genus FROM dogs

UNION SELECT *, 'Кошки' AS genus FROM cats

UNION SELECT *, 'Хомяки' AS genus FROM hamsters;

CREATE TABLE young_animal AS

SELECT Name, Birthday, Commands, genus, TIMESTAMPDIFF(MONTH, Birthday, CURDATE()) AS Age_in_month
FROM animals WHERE Birthday BETWEEN ADDDATE(curdate(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);
 
SELECT * FROM young_animal;

***12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.***

SELECT h.Name, h.Birthday, h.Commands, pa.Genus_name, ya.Age_in_month

FROM horses h

LEFT JOIN young_animal ya ON ya.Name = h.Name

LEFT JOIN pack_animals pa ON pa.Id = h.Genus_id

UNION 
SELECT d.Name, d.Birthday, d.Commands, pa.Genus_name, ya.Age_in_month 
FROM donkeys d

LEFT JOIN young_animal ya ON ya.Name = d.Name
LEFT JOIN pack_animals pa ON pa.Id = d.Genus_id

UNION
SELECT c.Name, c.Birthday, c.Commands, ha.Genus_name, ya.Age_in_month 
FROM cats c

LEFT JOIN young_animal ya ON ya.Name = c.Name
LEFT JOIN home_animals ha ON ha.Id = c.Genus_id

UNION
SELECT d.Name, d.Birthday, d.Commands, ha.Genus_name, ya.Age_in_month 
FROM dogs d

LEFT JOIN young_animal ya ON ya.Name = d.Name
LEFT JOIN home_animals ha ON ha.Id = d.Genus_id

UNION
SELECT hm.Name, hm.Birthday, hm.Commands, ha.Genus_name, ya.Age_in_month 
FROM hamsters hm

LEFT JOIN young_animal ya ON ya.Name = hm.Name
LEFT JOIN home_animals ha ON ha.Id = hm.Genus_id;

***13.Создать [класс с Инкапсуляцией методов и наследованием по диаграмме.](https://github.com/RomanStrashko/Final_work/tree/main/Classes)***



***14. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:***
* Завести новое животное
* определять животное в правильный класс
* увидеть список команд, которое выполняет животное
* обучить животное новым командам
* Реализовать навигацию по меню



***15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
животное” Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.***

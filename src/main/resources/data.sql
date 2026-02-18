-- CREATE TABLE students (
--                           id BIGSERIAL PRIMARY KEY,
--                           first_name VARCHAR(255),
--                           last_name VARCHAR(255),
--                           email VARCHAR(255) UNIQUE,
--                           age INTEGER
-- );
-- 1 massage
INSERT INTO students (first_name, last_name, email, age)
VALUES
    ('Ali', 'Khan', 'ali@mail.com', 20),
    ('John', 'Smith', 'john@mail.com', 22),
    ('Sara', 'Brown', 'sara@mail.com', 19);


INSERT INTO course (course_id, title, credits) VALUES
                                                   (1, 'Java Backend Development', 5),
                                                   (2, 'Database Systems', 4),
                                                   (3, 'Spring Boot Mastery', 6);

INSERT INTO lesson (lesson_id, topic, duration, course_id) VALUES
                                                               (1, 'Introduction to Java', 90, 1),
                                                               (2, 'OOP Principles', 120, 1),
                                                               (3, 'SQL Basics', 100, 2),
                                                               (4, 'PostgreSQL Advanced', 110, 2),
                                                               (5, 'Spring Core', 130, 3),
                                                               (6, 'Spring Data JPA', 140, 3);

INSERT INTO student (student_id, first_name, last_name, email) VALUES
                                                                   (1, 'Nureke', 'Abeke', 'nureke@mail.com'),
                                                                   (2, 'Aruzhan', 'Kaliyeva', 'aruzhan@mail.com'),
                                                                   (3, 'Dias', 'Serikov', 'dias@mail.com');

INSERT INTO student_profile (student_profile_id, address, phone, birth_date, student_id) VALUES
                                                                                             (1, 'Almaty, Abay 10', '+77011111111', '2000-05-10', 1),
                                                                                             (2, 'Astana, Kunaev 5', '+77022222222', '1999-08-15', 2),
                                                                                             (3, 'Shymkent, Tauke Khan 3', '+77033333333', '2001-01-20', 3);

INSERT INTO student_course (student_id, course_id) VALUES
                                                       (1, 1),
                                                       (1, 3),
                                                       (2, 2),
                                                       (3, 1),
                                                       (3, 2);

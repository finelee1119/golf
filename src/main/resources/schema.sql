DROP TABLE IF EXISTS teacher;
DROP TABLE IF EXISTS member;
DROP TABLE IF EXISTS golfclass;

CREATE TABLE teacher (
                         teacher_code VARCHAR(3) PRIMARY KEY,
                         teacher_name VARCHAR(15),
                         class_name VARCHAR(20),
                         class_price INT,
                         teacher_gegist_date VARCHAR(8)
);

CREATE TABLE member (
                         member_id VARCHAR(5) PRIMARY KEY,
                         member_name VARCHAR(15),
                         phone VARCHAR(11),
                         address VARCHAR(50),
                         grade VARCHAR(6)
);

CREATE TABLE golfclass (
                        class_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        regist_month VARCHAR(6),
                        class_no VARCHAR(5),
                        class_area VARCHAR(15),
                        tuition INT,
                        teacher_code VARCHAR(3),
                        FOREIGN KEY (teacher_code) REFERENCES teacher(teacher_code),
                        FOREIGN KEY (class_no) REFERENCES member(member_id)
);
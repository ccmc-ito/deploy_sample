CREATE TABLE IF NOT EXISTS departments (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS students (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    age INT,
    department_id BIGINT,
    FOREIGN KEY (department_id) REFERENCES departments (id)
);

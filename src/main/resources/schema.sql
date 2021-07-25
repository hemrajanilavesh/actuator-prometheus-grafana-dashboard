create table user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstname varchar_ignorecase(50) not null,
    lastname varchar_ignorecase(50) not null,
    contact varchar_ignorecase(50) not null
);
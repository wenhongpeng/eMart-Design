CREATE TABLE buyer(
id INT NOT NULL AUTO_INCREMENT,
user_name VARCHAR(40) NOT NULL,
password VARCHAR(40) NOT NULL,
email_id VARCHAR(100) NOT NULL,
mobile_number VARCHAR(40) NOT NULL,
created_datetime VARCHAR(40) NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE seller(
id INT NOT NULL AUTO_INCREMENT,
user_name VARCHAR(40) NOT NULL,
password VARCHAR(40) NOT NULL,
company_name VARCHAR(100) NOT NULL,
GSTIN VARCHAR(40) NOT NULL,
brief_about_company VARCHAR(400) NOT NULL,
postal_address VARCHAR(200) NOT NULL,
website VARCHAR(100) NOT NULL,
email_id VARCHAR(100) NOT NULL,
contact_number VARCHAR(40) NOT NULL,
created_datetime VARCHAR(40) NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE category(
category_id INT NOT NULL AUTO_INCREMENT,
category_name VARCHAR(100) NOT NULL,
brief_details VARCHAR(200) NOT NULL,
PRIMARY KEY (category_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE subcategory(
subcategory_id INT NOT NULL AUTO_INCREMENT,
subcategory_name VARCHAR(100) NOT NULL,
category_id INT NOT NULL,
brief_details VARCHAR(200) NOT NULL,
PRIMARY KEY (subcategory_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE items(
id INT NOT NULL AUTO_INCREMENT,
category_id INT NOT NULL,
subcategory_id INT NOT NULL,
price double NOT NULL,
item_name VARCHAR(100) NOT NULL,
description VARCHAR(200) NOT NULL,
stock_number INT NOT NULL,
remarks VARCHAR(200) NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE purchase_history(
id INT NOT NULL AUTO_INCREMENT,
buyer_id INT NOT NULL,
seller_id INT NOT NULL,
transaction_id INT NOT NULL,
item_id INT NOT NULL,
number_of_items INT NOT NULL,
date_time DATE,
remarks VARCHAR(200) NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE transactions(
id INT NOT NULL AUTO_INCREMENT,
buyer_id INT NOT NULL,
seller_id INT NOT NULL,
transaction_type VARCHAR(40) NOT NULL,
date_time DATE,
remarks VARCHAR(200) NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE discounts(
id INT NOT NULL AUTO_INCREMENT,
discount_code VARCHAR(40) NOT NULL,
percentage DOUBLE NOT NULL,
start_date DATE,
end_date DATE,
description VARCHAR(200) NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE cart(
id INT NOT NULL AUTO_INCREMENT,
buyer_id INT NOT NULL,
seller_id INT NOT NULL,
transaction_id INT NOT NULL,
item_id INT NOT NULL,
price double NOT NULL,
number_of_items INT NOT NULL,
date_time DATE,
remarks VARCHAR(200) NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

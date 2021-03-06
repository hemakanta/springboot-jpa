INSERT INTO B2C_BRAND(NAME) VALUES
 ('ADIDAS'),
 ('PUMA'),
 ('NIKE'),
 ('LEE'),
 ('LEVIS');

 INSERT INTO B2C_COLOR(NAME, CODE) VALUES
  ('RED','RD'),
  ('GREEN','GR'),
  ('BLUE','BL'),
  ('YELLOW','YL');

INSERT INTO B2C_PRODUCT_CATEGORY(NAME) VALUES
  ('SHIRT'),
  ('PANT'),
  ('SHORTS'),
  ('ACCESSORIES');

INSERT INTO B2C_PRODUCT(NAME,QUANTITY,SIZE,PRICE,FK_BRAND_ID,FK_COLOR_ID,FK_PRODUCT_CTGR_ID) VALUES
  ('STRIPED TSHIRT',10,'M',2000,1,1,1),
  ('BLUE WASHED JEANS',20,'S',3000,2,3,2),
  ('SOCKS',200,'L',300,4,2,3),
  ('WINDCHEATER JACKET',200,'S',300,4,2,2),
  ('SHIRT',200,'XL',300,4,2,1),
  ('FULL TSHIRT',200,'XXL',300,4,2,3),
  ('POLO TSHIRT',200,'XXL',300,4,1,3);

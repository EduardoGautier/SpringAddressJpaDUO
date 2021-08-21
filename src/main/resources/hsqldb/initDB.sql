DROP TABLE adresses IF EXISTS;

CREATE TABLE adresses (
  id INTEGER IDENTITY PRIMARY KEY,
  zip_code VARCHAR(30),
  public_place VARCHAR(30)
);
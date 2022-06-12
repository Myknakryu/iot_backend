CREATE TABLE meassurement (
    id serial PRIMARY KEY,
    light INTEGER,
    temp FLOAT,
    humidity FLOAT,
    pressure FLOAT,
    created TIMESTAMP DEFAULT now()
)
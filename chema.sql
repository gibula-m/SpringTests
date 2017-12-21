CREATE TABLE public.questions(
   user_id SERIAL PRIMARY KEY     NOT NULL,
   title           TEXT    NOT NULL,
   content           TEXT    NOT NULL,
   author_id INT,
   category INT
);
CREATE TABLE public.user(
   id SERIAL PRIMARY KEY     NOT NULL,
   username           TEXT    NOT NULL,
   email           TEXT    NOT NULL,
   password TEXT NOT NULL
);
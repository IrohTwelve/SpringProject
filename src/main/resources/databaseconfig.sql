-- users --
CREATE TABLE IF NOT EXISTS public.users (
  id       BIGSERIAL    NOT NULL PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  UNIQUE (username)
);

-- roles --
CREATE TABLE IF NOT EXISTS public.roles (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

-- user_roles --
CREATE TABLE IF NOT EXISTS public.user_roles (
  user_id BIGINT NOT NULL,
  role_id BIGINT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (role_id) REFERENCES roles (id)
);

-- default data --
INSERT INTO users VALUES (1 , 'vova', '$2a$11$uSXS6rLJ91WjgOHhEGDx..VGs7MkKZV68Lv5r1uwFu7HgtRn3dcXG');
INSERT INTO users VALUES (2 , 'anton', '123456');

INSERT INTO  roles VALUES (1, 'USER_ROLE');
INSERT INTO  roles VALUES (2, 'ADMIN_ROLE');
INSERT INTO  roles VALUES (3, 'MODERATOR_ROLE');

INSERT INTO user_roles VALUES (1, 2);
INSERT INTO user_roles VALUES (2, 1);

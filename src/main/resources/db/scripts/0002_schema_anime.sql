DROP SCHEMA IF EXISTS anime;
CREATE SCHEMA anime;


-- # ONE PIECE TABLES
-- ---------------------------------------------------------------
create table anime.devil_fruit_type
(
    id       serial                 not null,
    code     character varying(20),
    name     character varying(100) not null,
    summary  text,
    primary key (id)
);

create table anime.devil_fruit
(
    id           serial                 not null,
    type_id      int8                   not null,
    image_id     int8                   not null,
    name         character varying(100) not null,
    meaning      character varying(200),
    introduction text                   not null,
    history      text                   not null,
    primary key (id)
);
alter table if exists anime.devil_fruit add constraint fk_devil_fruit_type_id foreign key (type_id) references anime.devil_fruit_type (id);
alter table if exists anime.devil_fruit add constraint fk_devil_fruit_image_id foreign key (image_id) references master.image (id);

create table anime.character_devil_fruit
(
    id             serial  not null,
    character_id   int8    not null,
    devil_fruit_id int8    not null,
    active         boolean not null default false,
    primary key (id)
);
alter table if exists anime.character_devil_fruit add constraint fk_character_devil_fruit_devil_fruit_id foreign key (devil_fruit_id) references anime.devil_fruit (id);
alter table if exists anime.character_devil_fruit add constraint fk_character_devil_fruit_character_id foreign key (character_id) references master.character (id);
create unique index uk_character_devil_fruit_01 on anime.character_devil_fruit (devil_fruit_id, active) where active is true;

-- # END
-- ---------------------------------------------------------------

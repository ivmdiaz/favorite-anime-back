drop schema if exists master;
create schema master;

create table master.category_series
(
    id   serial                not null,
    code character varying(20),
    name character varying(50) not null,
    primary key (id)
);

create table master.series
(
    id          serial                not null,
    category_id int8                  not null,
    code        character varying(20),
    name        character varying(50) not null,
    author      character varying(50) not null,
    created     date                  not null,
    primary key (id)
);
alter table if exists master.series add constraint fk_series_category_id foreign key (category_id) references master.category_series (id);

create table master.relationship
(
    id        serial                not null,
    series_id int8,
    code      character varying(20),
    name      character varying(50) not null,
    primary key (id)
);
alter table if exists master.relationship add constraint fk_relationship_series_id foreign key (series_id) references master.series (id);

create table master.tag
(
    id        serial                not null,
    series_id int8,
    code      character varying(20),
    name      character varying(50) not null,
    summary   character varying(300),
    primary key (id)
);
alter table if exists master.tag add constraint fk_tag_series_id foreign key (series_id) references master.series (id);

create table master.image
(
    id        serial not null,
    series_id int8   not null,
    url       character varying(500),
    name      character varying(50),
    summary   text,
    tag       character varying(200),
    primary key (id)
);
alter table if exists master.image add constraint fk_image_series_id foreign key (series_id) references master.series (id);

create table master.location
(
    id        serial                not null,
    series_id int8                  not null,
    code      character varying(20),
    name      character varying(50) not null,
    summary   text,
    primary key (id)
);
alter table if exists master.location add constraint fk_location_series_id foreign key (series_id) references master.series (id);

create table master.location_gallery
(
    location_id int8 not null,
    image_id    int8 not null,
    primary key (location_id, image_id)
);
alter table if exists master.location_gallery add constraint fk_location_gallery_location_id foreign key (location_id) references master.location (id);
alter table if exists master.location_gallery add constraint fk_location_gallery_image_id foreign key (image_id) references master.image (id);

create table master.character
(
    id        serial                not null,
    series_id int8                  not null,
    image_id  int8                  not null,
    name      character varying(50) not null,
    alias     character varying(50),
    birthday  date,
    primary key (id)
);
alter table if exists master.character add constraint fk_character_series_id foreign key (series_id) references master.series (id);
alter table if exists master.character add constraint fk_character_image_id foreign key (image_id) references master.image (id);

create table master.character_summary
(
    id           serial not null,
    character_id int8   not null,
    location_id  int8   not null,
    introduction text   not null,
    history      text   not null,
    abilities    text   not null,
    primary key (id)
);
alter table if exists master.character_summary add constraint fk_character_summary_character_id foreign key (character_id) references master.character (id);
alter table if exists master.character_summary add constraint fk_character_summary_location_id foreign key (location_id) references master.location (id);

create table master.character_gallery
(
    character_id int8 not null,
    image_id     int8 not null,
    primary key (character_id, image_id)
);
alter table if exists master.character_gallery add constraint fk_character_gallery_character_id foreign key (character_id) references master.character (id);
alter table if exists master.character_gallery add constraint fk_character_gallery_image_id foreign key (image_id) references master.image (id);

create table master.character_tag
(
    character_id int8 not null,
    tag_id       int8 not null,
    primary key (character_id, tag_id)
);
alter table if exists master.character_tag add constraint fk_character_tag_character_id foreign key (character_id) references master.character (id);
alter table if exists master.character_tag add constraint fk_character_tag_tag_id foreign key (tag_id) references master.tag (id);

create table master.character_relationship
(
    id                        serial not null,
    relationship_id           int8   not null,
    character_id              int8   not null,
    relationship_character_id int8   not null,
    primary key (id)
);
alter table if exists master.character_relationship add constraint fk_character_relationship_relationship_id foreign key (relationship_id) references master.relationship (id);
alter table if exists master.character_relationship add constraint fk_character_relationship_character_id foreign key (character_id) references master.character (id);
alter table if exists master.character_relationship add constraint fk_character_relationship_relationship_character_id foreign key (relationship_character_id) references master.character (id);

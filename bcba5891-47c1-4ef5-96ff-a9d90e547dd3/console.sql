CREATE table  if not exists trainer
(
    id                serial primary key,
    name              varchar(128),
    surname           varchar(128),
    sports_achivments text not null ,
    rating            numeric not null

);
CREATE table if not exists gym
(
    id         serial primary key,
    name       varchar(128) not null,
    adress     varchar(128) not null,
    start_time time         not null,
    end_time   time         not null,
    rating     numeric
);

Create Table if not exists appointment
(
    id         serial primary key,
    trainer_id bigint  REFERENCES trainer (id),
    gym_id serial references gym (id),
    date       date not null,
    start_time time not null,
    end_time   time not null
);
CREATE table if not exists client
(
    id      serial primary key,
    name    varchar(128) not null,
    surname varchar(128) not null
);
CREATE table if not exists service
(
    id          serial primary key,
    name        varchar(128) not null,
    description varchar(512) not null
);
Create table if not exists trainer_service
(
    trainer_id serial references trainer (id),
    service_id serial references service (id)
);
CREATE table if not exists client_appointment
(
    appointment_id serial references appointment(id),
    client_id  bigint references client (id)
);
create table if not exists subscription
(
    id         serial primary key,
    gym_id     bigint references gym (id),
    client_id  bigint references client (id),
    valid_from date not null,
    valid_to   date not null
);
create table if not exists gym_trainer
(
   gym_id int  references gym (id),
    trainer_id bigint references trainer (id)
)





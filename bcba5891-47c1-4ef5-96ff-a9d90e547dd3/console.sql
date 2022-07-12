CREATE table trainer
(
    trainer_id  serial primary key,
    name              varchar(128),
    surname           varchar(128),
    date_of_birth     date not null ,
    sports_achivments varchar(512),
    rating numeric

);
CREATE table gym
(
    gym_id serial primary key,
    name   varchar(128) not null,
    adress varchar(128) not null,
    start_time time not null ,
    end_time time not null,
    rating numeric
);

Create Table appointment
(
    id_appointment serial primary key ,
    trainer_id bigint references trainer (trainer_id),
    gym_id bigint references gym(gym_id),
    date       date not null,
    start_time     time not null,
    end_time        time not null
);
CREATE table client(
    id_client serial primary key ,
    name varchar(128)not null,
    surname varchar(128) not null
);
CREATE table service(
    id_service serial primary key ,
    name varchar(128) not null ,
    description   varchar(512) not null
);
Create table trainer_service(
    trainer_id bigint references trainer(trainer_id),
    service_id bigint references  service(id_service)
);
CREATE  table  client_appointment(
    appointment_id bigint references appointment(id_appointment),
    client_id bigint references  client(id_client)
);
create table subscription(
    id_subscription serial primary key ,
    gym_id bigint references gym(gym_id),
    client_id bigint references client(id_client),
    valid_from date not null ,
    valid_to date not null
);
create  table gym_trainer(
    gym_id bigint references gym(gym_id),
    trainer_id bigint references trainer(trainer_id)
)





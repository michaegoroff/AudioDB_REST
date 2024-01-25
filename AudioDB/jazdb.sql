
create table Artist(
	id bigint primary key unique,                                                                                                                                                                                                                                         
    artist_name varchar(64),
    label_name varchar(64),
    formed_year int,
    birth_year int,
    death_year int,
    disbanded varchar(64),
    artist_genre varchar(64),
    artist_website varchar(1024),
    artist_facebook varchar(1024),
    artist_bio_eng varchar(8192),
    gender varchar(64),
    artist_country varchar(64),
    artist_logo_url varchar(1024),
    total_members int
);

create table Album(
	id bigint primary key unique,
    artist_Id bigint,
    album_name varchar(64),
    artist_name varchar(64),
    release_year int,
    album_genre varchar(64),
    label_name varchar(64),
    thumb_url varchar(1024),
    description_eng varchar(8192),
    foreign key (artist_id) references Artist(id)
);

create table Track(
	id bigint primary key unique,
    album_Id bigint,
    track_name varchar(256),
    album_name varchar(64),
    artist_name varchar(64),
    duration int,
    genre varchar(64),
    description_eng varchar(8192),
    track_number int,
    total_plays bigint,
    foreign key (album_id) references Album(id)
);

create table Clip(
	id bigint primary key auto_increment unique,
	track_Id bigint,
    artist_name varchar(64),
    track_name varchar(64),
    duration int,
    track_thumb_url varchar(1024),
    clip_url varchar(1024),
    description_eng varchar(8192),
    foreign key (track_id) references Track(id) 
);
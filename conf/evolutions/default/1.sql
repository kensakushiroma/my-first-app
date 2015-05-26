# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table authority (
  authority_id              integer not null,
  authority                 varchar(255),
  constraint pk_authority primary key (authority_id))
;

create table help_category (
  help_category_id          integer not null,
  help_category             varchar(255),
  constraint pk_help_category primary key (help_category_id))
;

create table member (
  member_id                 bigint not null,
  post_id                   integer,
  member_name               varchar(255),
  login_password            varchar(255),
  authority_id              integer,
  constraint pk_member primary key (member_id))
;

create table new (
  new_id                    integer not null,
  new                       varchar(255),
  constraint pk_new primary key (new_id))
;

create table post (
  post_id                   integer not null,
  post_name                 varchar(255),
  constraint pk_post primary key (post_id))
;

create table read (
  read_id                   integer not null,
  read                      varchar(255),
  constraint pk_read primary key (read_id))
;

create table thanks_card (
  thanks_card_id            integer not null,
  card_maker_id             integer,
  transmission_date         date,
  help_date                 date,
  helpcategory_id           integer,
  help                      varchar(255),
  thanks                    varchar(255),
  address_id                integer,
  constraint pk_thanks_card primary key (thanks_card_id))
;

create table user (
  id                        bigint not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (id))
;

create sequence authority_seq;

create sequence help_category_seq;

create sequence member_seq;

create sequence new_seq;

create sequence post_seq;

create sequence read_seq;

create sequence thanks_card_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists authority;

drop table if exists help_category;

drop table if exists member;

drop table if exists new;

drop table if exists post;

drop table if exists read;

drop table if exists thanks_card;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists authority_seq;

drop sequence if exists help_category_seq;

drop sequence if exists member_seq;

drop sequence if exists new_seq;

drop sequence if exists post_seq;

drop sequence if exists read_seq;

drop sequence if exists thanks_card_seq;

drop sequence if exists user_seq;


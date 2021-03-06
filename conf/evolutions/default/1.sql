# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table authority (
  authority_id              integer not null,
  authority                 varchar(255),
  constraint pk_authority primary key (authority_id))
;

create table help_category (
  help_id                   integer not null,
  help_name                 varchar(255),
  constraint pk_help_category primary key (help_id))
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
  thankscard_id             integer not null,
  cardmaker_id              integer,
  maker_post                varchar(255),
  maker_name                varchar(255),
  transmission_date         timestamp,
  help_date                 timestamp,
  helpcategory_id           integer,
  help                      varchar(255),
  thanks                    varchar(255),
  address_id                integer,
  address_post              varchar(255),
  address_name              varchar(255),
  constraint pk_thanks_card primary key (thankscard_id))
;

create sequence authority_seq;

create sequence help_category_seq;

create sequence member_seq;

create sequence new_seq;

create sequence post_seq;

create sequence read_seq;

create sequence thanks_card_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists authority;

drop table if exists help_category;

drop table if exists member;

drop table if exists new;

drop table if exists post;

drop table if exists read;

drop table if exists thanks_card;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists authority_seq;

drop sequence if exists help_category_seq;

drop sequence if exists member_seq;

drop sequence if exists new_seq;

drop sequence if exists post_seq;

drop sequence if exists read_seq;

drop sequence if exists thanks_card_seq;


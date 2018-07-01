create table `produto` (
  `id` bigint(20) not null,
  `descricao` varchar(255) default null,
  `litros` bigint(20) default null,
  primary key (`id`)
) engine=innodb;

create table `area` (
  `id` bigint(20) not null auto_increment,
  `area_total` float default null,
  `nome` varchar(255) default null,
  primary key (`id`)
) engine=innodb;

create table `parede` (
  `id_parede` bigint(20) not null auto_increment,
  `altura` float default null,
  `area_total` float default null,
  `descricao` varchar(255) default null,
  `largura` float default null,
  `area_id` bigint(20) default null,
  primary key (`id_parede`),
  constraint `parede_ibfk_1` foreign key (`area_id`) references `area` (`id`)
) engine=innodb;
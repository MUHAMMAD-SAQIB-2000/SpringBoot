use devteam;
SELECT * FROM devteam.season;
INSERT INTO `devteam`.`season`
(`id`,`season_number_of_episodes`,`season_image`,`season_season_number`,`tv_series_id`)
VALUES ('3','8','Stranger_Things_season_3.jpg','3','1');
update season set season_link='https://www.youtube.com/embed/6sg2g5Vv0Ec' where id =3;

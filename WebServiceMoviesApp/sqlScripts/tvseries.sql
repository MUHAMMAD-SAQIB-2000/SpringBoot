SELECT * FROM devteam.tvseries;
use devteam;
insert into tvseries values ('1', 'This is a season', 'stranger things.jpg', 'Stranger Things', '3', '9', '2014');
update tvseries set tvseries_link='https://www.youtube.com/embed/hyEWvTUCLQo' where id=1;
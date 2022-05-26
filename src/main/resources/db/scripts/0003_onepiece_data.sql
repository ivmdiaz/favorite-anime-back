-- # MASTER TABLES
-- ---------------------------------------------------------------
DO $$
DECLARE _series_id int8;
DECLARE _category_id int8;
BEGIN

insert into master.category_series (code, name) values ('AN01', 'Anime');
_category_id := (select id from master.category_series where code = 'AN01');

insert into master.series (category_id, code, name, author, created) values (_category_id, 'OP01', 'One Piece', 'Eiichirō Oda', '1997-07-19');
_series_id := (select id from master.series where code = 'OP01');

insert into master.relationship (series_id, code, name) values
(_series_id, 'OPRS01', 'Nakama'),
(_series_id, 'OPRS02', 'Captain'),
(_series_id, 'GERS01', 'Father'),
(_series_id, 'GERS02', 'Brother'),
(_series_id, 'GERS03', 'Grandfather'),
(_series_id, 'GERS04', 'Teacher');

insert into master.tag (series_id, code, name) values
(_series_id,'OPTG001','admiral'),
(_series_id,'OPTG002','akainu'),
(_series_id,'OPTG003','archaeologist'),
(_series_id,'OPTG004','arlong pirates'),
(_series_id,'OPTG005','big mom'),
(_series_id,'OPTG006','big mom pirates'),
(_series_id,'OPTG007','blackbeard'),
(_series_id,'OPTG008','blackbeard pirates'),
(_series_id,'OPTG009','bounty hunter'),
(_series_id,'OPTG010','captain'),
(_series_id,'OPTG011','commander'),
(_series_id,'OPTG012','cook'),
(_series_id,'OPTG013','cyborg'),
(_series_id,'OPTG014','devil child'),
(_series_id,'OPTG015','doctor'),
(_series_id,'OPTG016','donquixote pirates'),
(_series_id,'OPTG017','dragon'),
(_series_id,'OPTG018','fire fist'),
(_series_id,'OPTG019','fish man'),
(_series_id,'OPTG020','foxy pirates'),
(_series_id,'OPTG021','hawk eyes mihawk'),
(_series_id,'OPTG022','heart pirates'),
(_series_id,'OPTG023','helmsman'),
(_series_id,'OPTG024','hero ot the marines'),
(_series_id,'OPTG025','karate'),
(_series_id,'OPTG026','kuro ashi'),
(_series_id,'OPTG027','magma'),
(_series_id,'OPTG028','marine'),
(_series_id,'OPTG029','marines'),
(_series_id,'OPTG030','mugiwara'),
(_series_id,'OPTG031','navigator'),
(_series_id,'OPTG032','one piece'),
(_series_id,'OPTG033','orange'),
(_series_id,'OPTG034','pirate'),
(_series_id,'OPTG035','pirate king'),
(_series_id,'OPTG036','poneglyphs'),
(_series_id,'OPTG037','protagonist'),
(_series_id,'OPTG038','red hair'),
(_series_id,'OPTG039','red hair pirates'),
(_series_id,'OPTG040','reindeer'),
(_series_id,'OPTG041','revolutionary'),
(_series_id,'OPTG042','revolutionary army'),
(_series_id,'OPTG043','rocks pirates'),
(_series_id,'OPTG044','roger pirates'),
(_series_id,'OPTG045','ronin'),
(_series_id,'OPTG046','shichibukai'),
(_series_id,'OPTG047','shipwright'),
(_series_id,'OPTG048','sun pirates'),
(_series_id,'OPTG049','sniper'),
(_series_id,'OPTG050','spade pirates'),
(_series_id,'OPTG051','straw hat pirates'),
(_series_id,'OPTG052','swordsmen'),
(_series_id,'OPTG053','toms workers'),
(_series_id,'OPTG054','usopp pirates'),
(_series_id,'OPTG055','vice admiral'),
(_series_id,'OPTG056','vice captain'),
(_series_id,'OPTG057','whitebeard'),
(_series_id,'OPTG058','whitebeard pirates'),
(_series_id,'OPTG059','worlds worst criminal'),
(_series_id,'OPTG060','worst generation'),
(_series_id,'OPTG062','yonko');

insert into master.category_image (code, name) values ('OPCI001', 'one-piece-location-gallery');
insert into master.category_image (code, name) values ('OPCI002', 'one-piece-character-list');

_series_id := (select id from master.series where code = 'OP01');

insert into master.image (series_id, category_id, code, filename) values
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'east-blue','east-blue-001.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'east-blue','east-blue-002.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'east-blue','east-blue-003.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'grand-line','grand-line-001.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'grand-line','grand-line-002.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'grand-line','grand-line-003.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'grand-line','grand-line-004.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'north-blue','north-blue-001.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'north-blue','north-blue-002.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'south-blue','south-blue-001.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'south-blue','south-blue-002.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'west-blue','west-blue-001.png'),
(_series_id, (select id from master.category_image where code = 'OPCI001'), 'west-blue','west-blue-002.png');

insert into master.image (series_id, category_id, code, filename) values
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-ace','ace.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-akainu','akainu.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-bigmom','bigmom.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-blackbeard','blackbeard.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-chopper','chopper.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-dragon','dragon.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-franky','franky.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-garp','garp.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-jinbe','jinbe.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-law','law.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-luffy','luffy.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-mihawk','mihawk.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-nami','nami.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-robin','robin.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-roger','roger.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-sanji','sanji.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-shanks','shanks.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-usopp','usopp.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-whitebeard','whitebeard.png'),
(_series_id, (select id from master.category_image where code = 'OPCI002'), 'character-list-zoro','zoro.png');

insert into master.location (series_id, code, name, summary) values
(_series_id,'OPLC01','North Blue','The North Blue is an ocean in the Blue Sea. The North Blue, like its sister seas, comprises almost entirely of the ocean, with scattered islands and a border with the Red Line. It is the birthplace of such figures as Sanji of the Straw Hat Pirates, Trafalgar Law of the Heart Pirates, and the famous explorer, Mont Blanc Noland.'),
(_series_id,'OPLC02','South Blue','The South Blue is an ocean in the Blue Sea. The South Blue, like its sister seas, comprises almost entirely of the ocean, with scattered islands and a border with the Red Line. It is the ocean from which the St. Bliss sailed on its ill-fated voyage to Skypiea. Franky, Eustass Kid, Inazuma, and Portgas D. Ace all are from South Blue.'),
(_series_id,'OPLC03','East Blue','The East Blue, like its sister seas, comprises almost entirely of the ocean, with scattered islands and a border with the Red Line. It is the easternmost ocean of the Blue Sea and the birthplace of Pirate King Gol D. Roger, Monkey D. Luffy, Monkey D. Dragon, and Roronoa Zoro. Notable islands in the East Blue include Loguetown, Dawn Island, and Shells Town.'),
(_series_id,'OPLC04','West Blue','The West Blue, like its sister seas, comprises almost entirely of the ocean, with scattered islands and a border with the Red Line. It is the westernmost ocean of the Blue Sea and once contained the island of Ohara prior to its destruction by the World Government. Notable figures from the West Blue include the Emperor Shanks, Nico Robin and Brook.'),
(_series_id,'OPLC05','Grand Line','The Grand Line is an ocean route approximately located around the entire equator of the world, south of the North and East Blues and north of the South and West Blues. It is separated from the Blues on both the north and south ends by the Calm Belt. The Grand Line is split into two sections by the Red Line: the first section is known as Paradise, and the second is known as the New World.');

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC01' and i.code = 'north-blue';

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC02' and i.code = 'south-blue';

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC03' and i.code = 'east-blue';

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC04' and i.code = 'west-blue';

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC05' and i.code = 'grand-line';

insert into master.character (series_id, image_id, name, alias, birthday) values
(_series_id, (select id from master.image where code = 'character-list-luffy'),'Monkey D. Luffy','Luffy','1900-05-05'),
(_series_id, (select id from master.image where code = 'character-list-zoro'),'Roronoa Zoro','Pirate Hunter','1900-11-11'),
(_series_id, (select id from master.image where code = 'character-list-sanji'),'Vinsmoke Sanji','Black Leg','1900-03-02'),
(_series_id, (select id from master.image where code = 'character-list-nami'),'Nami','Cat Burglar','1900-07-03'),
(_series_id, (select id from master.image where code = 'character-list-chopper'),'Tony Tony Chopper','Cotton Candy Lover','1900-12-24'),
(_series_id, (select id from master.image where code = 'character-list-usopp'),'Usopp','Sogeking','1900-04-01'),
(_series_id, (select id from master.image where code = 'character-list-franky'),'Franky','Cutty Flam','1900-03-09'),
(_series_id, (select id from master.image where code = 'character-list-robin'),'Nico Robin','Miss all Sunday','1900-02-06'),
(_series_id, (select id from master.image where code = 'character-list-jinbe'),'Jinbe','Knight of the Sea','1900-04-02'),
(_series_id, (select id from master.image where code = 'character-list-law'),'Trafalgar D. Water Law','Trafalgar Law','1900-10-06'),
(_series_id, (select id from master.image where code = 'character-list-shanks'),'Shanks','Red Hair','1900-03-09'),
(_series_id, (select id from master.image where code = 'character-list-ace'),'Portgas D. Ace','Fire Fist','1900-02-01'),
(_series_id, (select id from master.image where code = 'character-list-roger'),'Gol D. Roger','Gold Roger','1900-12-31'),
(_series_id, (select id from master.image where code = 'character-list-whitebeard'),'Edward Newgate','Whitebeard','1900-04-06'),
(_series_id, (select id from master.image where code = 'character-list-blackbeard'),'Marshall D. Teach','Blackbeard','1900-07-03'),
(_series_id, (select id from master.image where code = 'character-list-garp'),'Monkey D. Garp','Hero of the Marines','1900-05-02'),
(_series_id, (select id from master.image where code = 'character-list-akainu'),'Sakazuki','Akainu','1900-07-16'),
(_series_id, (select id from master.image where code = 'character-list-mihawk'),'Dracule Mihawk','Hawk Eyes','1900-03-09'),
(_series_id, (select id from master.image where code = 'character-list-bigmom'),'Charlotte Linlin','Big Mom','1900-02-15'),
(_series_id, (select id from master.image where code = 'character-list-dragon'),'Monkey D. Dragon','Worlds Worst Criminal','1900-10-05');

-- # ANIME TABLES
-- ---------------------------------------------------------------
insert into anime.devil_fruit_type (code, name, summary) values
('OPDV001','Paramecia','Paramecia Fruits can alter features of the users body such as a rubber physique or a body of blades. Some Paramecia Fruits allow the user to modify the people, objects, and environment around them, like by making things levitate or turning people into toys. Finally, there are some users that can generate and manipulate substances, such as wax and poison.'),
('OPDV002','Logia','Logia Fruits allow their users to create, control, and transform their body into a natural element, such as ice, mud, smoke, fire, or darkness. The elemental transformation effectively makes the user intangible, as well as allowing the user to remain in control of their body, even when it is broken into pieces. They also gain every ability related to that element, such as sand being able to absorb moisture or lightning being able to travel through conductive objects.'),
('OPDV003','Ancient Zoan','Zoan Fruits gain the ability to transform into an animal, as well as transform into a hybrid form of their own species and the species the fruit allows them to transform into. The subtype ancient zoan allows the user to transform into an extinct species, such as dinosaurs. Ancient Zoans are rare and they appear to be stronger than regular Zoans.'),
('OPDV004','Mythical Zoan','Zoan Fruits gain the ability to transform into an animal, as well as transform into a hybrid form of their own species and the species the fruit allows them to transform into. The subtype mythical zoan allows the user to transform into mythological creatures, such as a dragon or a phoenix. Mythical Zoan animals tend to have special powers, like a phoenix Zoan being able to generate flames that have healing powers. Mythical Zoans are the rarest type of Devil Fruit.'),
('OPDV005','Artificial Zoan','Zoan Fruits gain the ability to transform into an animal, as well as transform into a hybrid form of their own species and the species the fruit allows them to transform into. The subtype artificially zoan fruits cause the user to permanently take on an animal characteristic; though, much more rarely, the user would be able to transform at will. The Artificial Zoan Fruits had a 10% success rate, while the other 90%, in addition to not gaining animal traits and losing the ability to swim, were stripped of the ability to express negative emotions, leaving them only able to smile and laugh, regardless of how they actually feel. The Artificial Fruits were developed by Vegapunk and Donquixote Doflamingo.');

END $$;

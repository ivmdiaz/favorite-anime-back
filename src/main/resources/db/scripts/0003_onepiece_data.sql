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
(_series_id, 'GERS01', 'Father'),
(_series_id, 'GERS02', 'Brother'),
(_series_id, 'GERS03', 'Granfather'),
(_series_id, 'GERS04', 'Teacher');

insert into master.tag (series_id, code, name, summary) values
(_series_id,'OPTG001','admiral',NULL),
(_series_id,'OPTG002','akainu',NULL),
(_series_id,'OPTG003','archaeologist',NULL),
(_series_id,'OPTG004','arlong pirates',NULL),
(_series_id,'OPTG005','big mom',NULL),
(_series_id,'OPTG006','big mom pirates',NULL),
(_series_id,'OPTG007','blackbeard',NULL),
(_series_id,'OPTG008','blackbeard pirates',NULL),
(_series_id,'OPTG009','bounty hunter',NULL),
(_series_id,'OPTG010','captain',NULL),
(_series_id,'OPTG011','commander',NULL),
(_series_id,'OPTG012','cook',NULL),
(_series_id,'OPTG013','cyborg',NULL),
(_series_id,'OPTG014','devil child',NULL),
(_series_id,'OPTG015','doctor',NULL),
(_series_id,'OPTG016','donquixote pirates',NULL),
(_series_id,'OPTG017','dragon',NULL),
(_series_id,'OPTG018','fire fist',NULL),
(_series_id,'OPTG019','fish man',NULL),
(_series_id,'OPTG020','foxy pirates',NULL),
(_series_id,'OPTG021','hawk eyes mihawk',NULL),
(_series_id,'OPTG022','heart pirates',NULL),
(_series_id,'OPTG023','helmsman',NULL),
(_series_id,'OPTG024','hero ot the marines',NULL),
(_series_id,'OPTG025','karate',NULL),
(_series_id,'OPTG026','kuro ashi',NULL),
(_series_id,'OPTG027','magma',NULL),
(_series_id,'OPTG028','marine',NULL),
(_series_id,'OPTG029','marines',NULL),
(_series_id,'OPTG030','mugiwara',NULL),
(_series_id,'OPTG031','navigator',NULL),
(_series_id,'OPTG032','one piece',NULL),
(_series_id,'OPTG033','orange',NULL),
(_series_id,'OPTG034','pirate',NULL),
(_series_id,'OPTG035','pirate king',NULL),
(_series_id,'OPTG036','poneglyphs','mysterious steles with historical knowledge inscribed on them in an ancient script.'),
(_series_id,'OPTG037','protagonist',NULL),
(_series_id,'OPTG038','red hair',NULL),
(_series_id,'OPTG039','red hair pirates',NULL),
(_series_id,'OPTG040','reindeer',NULL),
(_series_id,'OPTG041','revolutionary',NULL),
(_series_id,'OPTG042','revolutionary army',NULL),
(_series_id,'OPTG043','rocks pirates',NULL),
(_series_id,'OPTG044','roger pirates',NULL),
(_series_id,'OPTG045','ronin',NULL),
(_series_id,'OPTG046','shichibukai','Were a selection of seven powerful and notorious pirates allied to the World Government.'),
(_series_id,'OPTG047','shipwright',NULL),
(_series_id,'OPTG048','sun pirates',NULL),
(_series_id,'OPTG049','sniper',NULL),
(_series_id,'OPTG050','spade pirates',NULL),
(_series_id,'OPTG051','straw hat pirates',NULL),
(_series_id,'OPTG052','swordsmen',NULL),
(_series_id,'OPTG053','toms workers',NULL),
(_series_id,'OPTG054','usopp pirates',NULL),
(_series_id,'OPTG055','vice admiral',NULL),
(_series_id,'OPTG056','vice captain',NULL),
(_series_id,'OPTG057','whitebeard',NULL),
(_series_id,'OPTG058','whitebeard pirates',NULL),
(_series_id,'OPTG059','worlds worst criminal',NULL),
(_series_id,'OPTG060','worst generation','Is a term that refers to twelve individuals consisting of the eleven top rookie pirates that arrived at the Sabaody Archipelago'),
(_series_id,'OPTG062','yonko','Are the four most notorious and powerful pirate captains in the world');

insert into master.image (series_id, name, url,tag) values
(_series_id,'east-blue','one-piece/places/east-blue-001.png','place'),
(_series_id,'east-blue','one-piece/places/east-blue-002.png','place'),
(_series_id,'east-blue','one-piece/places/east-blue-003.png','place'),
(_series_id,'grand-line','one-piece/places/grand-line-001.png','place'),
(_series_id,'grand-line','one-piece/places/grand-line-002.png','place'),
(_series_id,'grand-line','one-piece/places/grand-line-003.png','place'),
(_series_id,'grand-line','one-piece/places/grand-line-004.png','place'),
(_series_id,'north-blue','one-piece/places/north-blue-001.png','place'),
(_series_id,'north-blue','one-piece/places/north-blue-002.png','place'),
(_series_id,'south-blue','one-piece/places/south-blue-001.png','place'),
(_series_id,'south-blue','one-piece/places/south-blue-002.png','place'),
(_series_id,'west-blue','one-piece/places/west-blue-001.png','place'),
(_series_id,'west-blue','one-piece/places/west-blue-002.png','place');

insert into master.image (series_id, name, url,tag) values
(_series_id,'character-list-ace','one-piece/characters/ace.png','character-list'),
(_series_id,'character-list-akainu','one-piece/characters/akainu.png','character-list'),
(_series_id,'character-list-bigmom','one-piece/characters/bigmom.png','character-list'),
(_series_id,'character-list-blackbeard','one-piece/characters/blackbeard.png','character-list'),
(_series_id,'character-list-chopper','one-piece/characters/chopper.png','character-list'),
(_series_id,'character-list-dragon','one-piece/characters/dragon.png','character-list'),
(_series_id,'character-list-franky','one-piece/characters/franky.png','character-list'),
(_series_id,'character-list-garp','one-piece/characters/garp.png','character-list'),
(_series_id,'character-list-jinbe','one-piece/characters/jinbe.png','character-list'),
(_series_id,'character-list-law','one-piece/characters/law.png','character-list'),
(_series_id,'character-list-luffy','one-piece/characters/luffy.png','character-list'),
(_series_id,'character-list-mihawk','one-piece/characters/mihawk.png','character-list'),
(_series_id,'character-list-nami','one-piece/characters/nami.png','character-list'),
(_series_id,'character-list-robin','one-piece/characters/robin.png','character-list'),
(_series_id,'character-list-roger','one-piece/characters/roger.png','character-list'),
(_series_id,'character-list-sanji','one-piece/characters/sanji.png','character-list'),
(_series_id,'character-list-shanks','one-piece/characters/shanks.png','character-list'),
(_series_id,'character-list-usopp','one-piece/characters/usopp.png','character-list'),
(_series_id,'character-list-whitebeard','one-piece/characters/whitebeard.png','character-list'),
(_series_id,'character-list-zoro','one-piece/characters/zoro.png','character-list');

insert into master.location (series_id, code, name, summary) values
(_series_id,'OPLC01','North Blue','The North Blue is an ocean in the Blue Sea. The North Blue, like its sister seas, comprises almost entirely of the ocean, with scattered islands and a border with the Red Line. It is the birthplace of such figures as Sanji of the Straw Hat Pirates, Trafalgar Law of the Heart Pirates, and the famous explorer, Mont Blanc Noland.'),
(_series_id,'OPLC02','South Blue','The South Blue is an ocean in the Blue Sea. The South Blue, like its sister seas, comprises almost entirely of the ocean, with scattered islands and a border with the Red Line. It is the ocean from which the St. Bliss sailed on its ill-fated voyage to Skypiea. Franky, Eustass Kid, Inazuma, and Portgas D. Ace all are from South Blue.'),
(_series_id,'OPLC03','East Blue','The East Blue, like its sister seas, comprises almost entirely of the ocean, with scattered islands and a border with the Red Line. It is the easternmost ocean of the Blue Sea and the birthplace of Pirate King Gol D. Roger, Monkey D. Luffy, Monkey D. Dragon, and Roronoa Zoro. Notable islands in the East Blue include Loguetown, Dawn Island, and Shells Town.'),
(_series_id,'OPLC04','West Blue','The West Blue, like its sister seas, comprises almost entirely of the ocean, with scattered islands and a border with the Red Line. It is the westernmost ocean of the Blue Sea and once contained the island of Ohara prior to its destruction by the World Government. Notable figures from the West Blue include the Emperor Shanks, Nico Robin and Brook.'),
(_series_id,'OPLC05','Grand Line','The Grand Line is an ocean route approximately located around the entire equator of the world, south of the North and East Blues and north of the South and West Blues. It is separated from the Blues on both the north and south ends by the Calm Belt. The Grand Line is split into two sections by the Red Line: the first section is known as Paradise, and the second is known as the New World.');

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC01' and i.name = 'north-blue';

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC02' and i.name = 'south-blue';

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC03' and i.name = 'east-blue';

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC04' and i.name = 'west-blue';

insert into master.location_gallery (location_id, image_id)
select l.id, i.id from master.location l, master.image i where l.code = 'OPLC05' and i.name = 'grand-line';

insert into master.character (series_id, image_id, name, alias, birthday) values
(_series_id, (select id from master.image where name = 'character-list-luffy'),'Monkey D. Luffy','Luffy','1900-05-05'),
(_series_id, (select id from master.image where name = 'character-list-zoro'),'Roronoa Zoro','Pirate Hunter','1900-11-11'),
(_series_id, (select id from master.image where name = 'character-list-sanji'),'Vinsmoke Sanji','Black Leg','1900-03-02'),
(_series_id, (select id from master.image where name = 'character-list-nami'),'Nami','Cat Burglar','1900-07-03'),
(_series_id, (select id from master.image where name = 'character-list-chopper'),'Tony Tony Chopper','Cotton Candy Lover','1900-12-24'),
(_series_id, (select id from master.image where name = 'character-list-usopp'),'Usopp','Sogeking','1900-04-01'),
(_series_id, (select id from master.image where name = 'character-list-franky'),'Franky','Cutty Flam','1900-03-09'),
(_series_id, (select id from master.image where name = 'character-list-robin'),'Nico Robin','Miss all Sunday','1900-02-06'),
(_series_id, (select id from master.image where name = 'character-list-jinbe'),'Jinbe','Knight of the Sea','1900-04-02'),
(_series_id, (select id from master.image where name = 'character-list-law'),'Trafalgar D. Water Law','Trafalgar Law','1900-10-06'),
(_series_id, (select id from master.image where name = 'character-list-shanks'),'Shanks','Red Hair','1900-03-09'),
(_series_id, (select id from master.image where name = 'character-list-ace'),'Portgas D. Ace','Fire Fist','1900-02-01'),
(_series_id, (select id from master.image where name = 'character-list-roger'),'Gol D. Roger','Gold Roger','1900-12-31'),
(_series_id, (select id from master.image where name = 'character-list-whitebeard'),'Edward Newgate','Whitebeard','1900-04-06'),
(_series_id, (select id from master.image where name = 'character-list-blackbeard'),'Marshall D. Teach','Blackbeard','1900-07-03'),
(_series_id, (select id from master.image where name = 'character-list-garp'),'Monkey D. Garp','Hero of the Marines','1900-05-02'),
(_series_id, (select id from master.image where name = 'character-list-akainu'),'Sakazuki','Akainu','1900-07-16'),
(_series_id, (select id from master.image where name = 'character-list-mihawk'),'Dracule Mihawk','Hawk Eyes','1900-03-09'),
(_series_id, (select id from master.image where name = 'character-list-bigmom'),'Charlotte Linlin','Big Mom','1900-02-15'),
(_series_id, (select id from master.image where name = 'character-list-dragon'),'Monkey D. Dragon','Worlds Worst Criminal','1900-10-05');

-- # ANIME TABLES
-- ---------------------------------------------------------------
insert into anime.devil_fruit_type (code, name, summary) values
('OPDV001','Paramecia','Paramecia Fruits can alter features of the users body such as a rubber physique or a body of blades. Some Paramecia Fruits allow the user to modify the people, objects, and environment around them, like by making things levitate or turning people into toys. Finally, there are some users that can generate and manipulate substances, such as wax and poison.'),
('OPDV002','Logia','Logia Fruits allow their users to create, control, and transform their body into a natural element, such as ice, mud, smoke, fire, or darkness. The elemental transformation effectively makes the user intangible, as well as allowing the user to remain in control of their body, even when it is broken into pieces. They also gain every ability related to that element, such as sand being able to absorb moisture or lightning being able to travel through conductive objects.'),
('OPDV003','Ancient Zoan','Zoan Fruits gain the ability to transform into an animal, as well as transform into a hybrid form of their own species and the species the fruit allows them to transform into. The subtype ancient zoan allows the user to transform into an extinct species, such as dinosaurs. Ancient Zoans are rare and they appear to be stronger than regular Zoans.'),
('OPDV004','Mythical Zoan','Zoan Fruits gain the ability to transform into an animal, as well as transform into a hybrid form of their own species and the species the fruit allows them to transform into. The subtype mythical zoan allows the user to transform into mythological creatures, such as a dragon or a phoenix. Mythical Zoan animals tend to have special powers, like a phoenix Zoan being able to generate flames that have healing powers. Mythical Zoans are the rarest type of Devil Fruit.'),
('OPDV005','Artificial Zoan','Zoan Fruits gain the ability to transform into an animal, as well as transform into a hybrid form of their own species and the species the fruit allows them to transform into. The subtype artificially zoan fruits cause the user to permanently take on an animal characteristic; though, much more rarely, the user would be able to transform at will. The Artificial Zoan Fruits had a 10% success rate, while the other 90%, in addition to not gaining animal traits and losing the ability to swim, were stripped of the ability to express negative emotions, leaving them only able to smile and laugh, regardless of how they actually feel. The Artificial Fruits were developed by Vegapunk and Donquixote Doflamingo.');

END $$;

DO $$
DECLARE _series_id int8;
BEGIN

_series_id := (select id from master.series where code = 'OP01');

-- # Monkey D. Luffy
-- ---------------------------------------------------------------
insert into master.character_detail (character_id,location_id,code,introduction,history,abilities)
values ((select id from master.character where alias = 'Luffy'),
        (select id from master.location where code = 'OPLC03'),
        'OPCD0001',
        'Monkey D. Luffy, also known as "Straw Hat Luffy" and commonly as "Straw Hat", is the main protagonist of the manga and anime, One Piece. He is the founder and captain of the increasingly infamous and powerful Straw Hat Pirates, as well as one of its top fighters. His lifelong dream is to become the Pirate King by finding the legendary treasure left behind by the late Gol D. Roger. He believes that being the Pirate King means having the most freedom in the world.\nBorn in Foosha Village, Luffy accidentally ate the Gomu Gomu no Mi at age 7, which turned his body into rubber. He met "Red-Haired" Shanks, who gave Luffy the very Straw Hat that has become Luffy''s signature accessory, having gifted it to the boy as part of a promise for them to meet again someday. Luffy is the son of the Revolutionary leader Monkey D. Dragon, the grandson of the Marine hero Monkey D. Garp, the sworn brother of the late "Fire Fist" Portgas D. Ace and Revolutionary Chief-of-Staff Sabo, and the foster son of Curly Dadan. He is one of the few people in the world who carries the Will of D.\nLuffy has gone up against numerous global powers around him, starting with fighting the most powerful pirates in the East Blue and moving to clashes against the Marines, Seven Warlords of the Sea, Cipher Pol, World Nobles, and even the Four Emperors of the Grand Line, emerging victorious in a majority of these battles. He invaded and indirectly caused the annihilation of Enies Lobby, escaped the impregnable Impel Down, and was a focal figure in the Summit War of Marineford. He either defeated or befriended seven of the eleven known past or present Warlords prior to the organization''s dissolution, and has invaded the territory of two Emperors. Luffy''s accomplishments and heritage have caused him to be labeled as a "Dangerous Future Element" while in the process gaining a reputation for being "reckless" and, in some cases, "insane", earning the wrath of Fleet Admiral Sakazuki, the Marine Headquarters, and even the World Government.\nLuffy also has a penchant for attracting followers and has unwillingly been named the leader of the Straw Hat Grand Fleet, consisting of seven pirate crews who swore to come to his aid whenever he wishes. After learning of this and his exploits against the Big Mom Pirates, the press has labeled him the "Fifth Emperor of the Sea", though many prominent figures consider this to be exaggerated.',
        'Luffy was born in Foosha Village to Monkey D. Dragon and an unknown woman. Dragon left Luffy in the care of his grandfather, Monkey D. Garp, who did many dangerous things to Luffy to make him stronger, like throwing him down a deep ravine, leaving him alone in the wild, and tying him to a balloon.\nWhen Luffy was 6, Shanks and the Red Hair Pirates stationed themselves in Foosha Village. While they were there, their sniper Yasopp frequently told Luffy that he had a son his age named Usopp.Luffy wanted to join the Red Hair Pirates, and after they had been in the village for nearly a year, he stabbed himself under his left eye to prove he was tough enough to be a pirate.\n After the Red Hair Pirates left, Garp took Luffy to Mt. Colubo and placed him in the care of the mountain bandit Curly Dadan and the Dadan Family. He introduced Luffy to Dadan''s other ward Portgas D. Ace, but Ace was cold toward Luffy.Every day, Ace would travel away from the Dadan Family hideout, and Luffy attempted to follow him. Ace would put obstacles in his path to stop him, but Luffy continued following him.\nEventually, Luffy made it to Gray Terminal, where he found Ace counting money with a boy named Sabo. When Luffy went up to them, Ace and Sabo captured him and talked about killing him to keep their secret safe. Porchemy of the Bluejam Pirates then came walking through the woods, and as Ace and Sabo hid from him, they left Luffy to be captured. Porchemy took Luffy to his base and interrogated him about the money Ace and Sabo had stolen from his crew. Luffy refused to answer him, even when Porchemy nearly beat him to death with spiked gloves.Ace and Sabo then came to the base and freed Luffy, with Ace beating Porchemy.After this incident, Luffy, Ace, and Sabo became friends and went on many adventures together, becoming known throughout the Goa Kingdom.\nLater, Ace that Sabo had been killed by a World Noble while setting out to sea, leaving them devastated. Luffy went to the coast and cried all night, and Ace came to him the next morning.Luffy made Ace promise that he would not die, swearing to become stronger. For the next seven years, the two continued adventuring and training to get stronger, with Luffy learning to throw effective long-range punches with his stretching. A 14-year-old Luffy then bid farewell to Ace, who sailed out to sea as a pirate upon turning 17. Three more years passed before Luffy became a pirate himself, and he bid farewell to the Dadan Family before going to Foosha Village to say goodbye and set sail. When the Lord of the Coast emerged to confront him, Luffy punched it away with Gomu Gomu no Pistol. As he sailed, Luffy plotted to recruit ten crewmates, get a Jolly Roger, and become the Pirate King.',
        'Despite his relatively small physical stature compared to most of the world''s powerful fighters, Luffy has developed significant physical strength to match them. His grandfather Garp used harsh and unorthodox training methods to make him grow stronger, such as leaving him alone in the wilderness as a young child, making him fight monkeys, tying him to balloons so he would float away, or throwing him into a bottomless pit, as well as several years of further rigorous training in the extremely harsh environment in Mt. Colubo and Rusukaina. A notable example of this strength was on Dressrosa when he used his foot to block a stomp by Donquixote Doflamingo, a man nearly twice his height with immense physical power of his own, without any leverage. Earlier that day, he had effortlessly flipped over the massive gladiator Spartan, defeating him. In Skypiea, he was capable of moving around during his fight against Enel despite having a massive golden ball molded around his hand, and even climbed up a massive beanstalk with it.  When caught between two large brick buildings in Water 7, he was eventually able to push them apart to free himself.Even in a severely weakened state after his calamitous battle at Marineford, Luffy was still able to cause massive destruction on Amazon Lily and lift a boulder several times larger than himself with enough force to destroy a nearby rock formation.\nLuffy has utilized his Devil Fruit Gears to tremendously increase his physical strength and subdue powerful opponents like Blueno, Rob Lucci, and Donquixote Doflamingo. He took out a member of the Marines'' Giant Squad with a single Gear 3 punch, and two years later, he defeated the powerful giant Hajrudin with a single Gear 2 punch to the face. On Fish-Man Island, the Sea Kings believed he would have completely destroyed the gigantic ship Noah before it would have landed had they not stopped him.\nWhen he was imprisoned in Wano Country, he wore Seastone handcuffs that significantly weakened him and prevented him from using his Devil Fruit powers, and he exploited his prison labor as a new training method to get stronger in his weakened state, being able to lift and carry hundreds of blocks several times his size, and a few days later was able to break through the helmet of the vice warden Daifugo and injure him with a simple kick.'
        );

insert into master.category_image (code,"name")
values ('OPCI003','character-detail-luffy');

insert into master.image (series_id, category_id, code, filename) values
(_series_id, (select id from master.category_image where code = 'OPCI003'), 'luffy-gallery','luffy-gallery-01.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI003'), 'luffy-gallery','luffy-gallery-02.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI003'), 'luffy-gallery','luffy-gallery-03.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI003'), 'luffy-gallery','luffy-gallery-04.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI003'), 'luffy-gallery','luffy-gallery-05.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI003'), 'luffy-gallery','luffy-gallery-06.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI003'), 'luffy-gallery','luffy-gallery-07.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI003'), 'luffy-gallery','luffy-gallery-08.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI003'), 'luffy-gallery','luffy-gallery-09.jpg');

insert into master.character_gallery (character_detail_id, image_id)
select cd.id, i.id from master.character_detail cd, master.image i where cd.code = 'OPCD0001' and i.code = 'luffy-gallery';

insert into master.character_tag (character_detail_id,tag_id) values
((select id from master.character_detail where code = 'OPCD0001'), (select id from master.tag where code = 'OPTG034')),
((select id from master.character_detail where code = 'OPCD0001'), (select id from master.tag where code = 'OPTG010')),
((select id from master.character_detail where code = 'OPCD0001'), (select id from master.tag where code = 'OPTG030')),
((select id from master.character_detail where code = 'OPCD0001'), (select id from master.tag where code = 'OPTG051')),
((select id from master.character_detail where code = 'OPCD0001'), (select id from master.tag where code = 'OPTG037')),
((select id from master.character_detail where code = 'OPCD0001'), (select id from master.tag where code = 'OPTG062')),
((select id from master.character_detail where code = 'OPCD0001'), (select id from master.tag where code = 'OPTG060'));

insert into master.character_relationship (relationship_id,character_detail_id, character_id) values
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Zoro%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Sanji%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Nami%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Chopper%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Usopp%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Franky%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Robin%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Jinbe%')),
((select id from master.relationship where code = 'GERS02'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Portgas%')),
((select id from master.relationship where code = 'GERS03'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Garp%')),
((select id from master.relationship where code = 'GERS01'),(select id from master.character_detail where code = 'OPCD0001'),(select id from master.character where name like '%Dragon%'));

-- # Roronoa Zoro
-- ---------------------------------------------------------------

insert into master.character_detail (character_id,location_id,code,introduction,history,abilities)
values ((select id from master.character where name like '%Zoro%'),
        (select id from master.location where code = 'OPLC03'),
        'OPCD0002',
        'Roronoa Zoro, also known as "Pirate Hunter" Zoro, is the combatant of the Straw Hat Pirates, and one of their two swordsmen. Formerly a bounty hunter, he is the second member of Luffy''s crew and the first to join it, doing so in the Romance Dawn Arc.\nAs a master of Three Sword Style, a swordsmanship style which he created during his childhood training in Shimotsuki Village, Zoro is among the three most powerful combatants of the Straw Hats, alongside Luffy and Sanji. His dream is to become the greatest swordsman in the world, in order to honor a promise he made to his deceased childhood friend Kuina.\nIn addition to his infamy as one of the Straw Hats and as a former bounty hunter, Zoro is also regarded as one of twelve pirates who are referred to as the "Worst Generation".\nZoro is a muscular man of average height with lightly tanned skin. He always carries his three swords along with him, bundled up with a green haramaki over his right hip, allowing him to easily draw them with his left hand. Of the three swords he has on his person, he has always been seen carrying the Wado Ichimonji, while his other two swords have varied over time due to them being destroyed and subsequently replaced with progressively better ones. Although his right hand is usually seen resting over them, he can also use this hand to pull his swords out before sitting down. He has three identical gold earrings on his left earlobe. Zoro normally keeps a black bandana tied around his left bicep and ties it around his head when he is fighting seriously against an opponent.\nZoro''s body is covered with scars from his many battles, most notably the massive scar stretching from his left shoulder to his right hip that he acquired during his loss against the world''s greatest swordsman, Dracule Mihawk, at Baratie. His other visible scars are the scars he inflicted upon his ankles in a desperate attempt to free himself from Mr. 3''s Giant Candle Service Set by trying to cut his feet off at Little Garden. After the timeskip, he gained another scar over his left eye, obtained through unknown means.\nZoro''s other remarkable feature is his cropped green hair, which Sanji often teases him about by calling him "marimo" (moss-ball, moss-head in the Viz Manga and FUNimation dub) due to its resemblance to one.',
        'Zoro was born in the East Blue. By the time he was 8 years old, Zoro trained at a dojo in Shimotsuki Village. Zoro stated in the Baratie, that, "Once he decided that he would become an invincible swordsman, he left his life behind".\nEven as a child, Zoro was strong enough to defeat most adults, but could not defeat Kuina, the daughter of the dojo''''s master, Koushirou. During a training session, he got to meet Kuina''''s grandfather, Shimotsuki Kozaburo, who gifted him a pair of swords to aid in his practice. After their 2000th fight (and Kuina''''s 2000th victory), Zoro challenged her in private for one more match with real swords. Although he had improved tremendously since their first match, he still lost and cried with frustration, telling Kuina about his dream of becoming the world''''s greatest swordsman. Hearing this, Kuina confided in Zoro, telling him that she shared the same dream but knew she could never attain it. Her father had told her that girls could never be true sword masters, and that her fighting potential would decrease as her body matured. Zoro, annoyed by her defeatist attitude in spite of repeatedly winning against him, told her that one day he would beat her because he was more skilled, not because she was a girl. The two made a promise that either of them had to become the world''''s best swordsman.\nThe next day, Kuina suffered a fatal fall down the stairs of her dojo, much to Zoro''''s anger and disappointment. Realizing that she would never have a chance to fulfill her dream, Zoro took it upon himself, asking Koushirou for her sword, Wado Ichimonji, and began working to develop his signature Three Sword Style, holding his own two swords in each hand, and Kuina''''s clenched between his teeth.\nEventually, Zoro learned of Dracule "Hawk-Eye" Mihawk, who currently holds the title of the greatest swordsman in the world. He set off to sea, searching for him in order to challenge him to a duel. However, he lost his way and could not find his way back home. In order to survive on his own, he took on bounties to pay for living expenses. He quickly built a famous reputation for himself as a "Pirate Hunter" in the East Blue and even in the Grand Line as Baroque Works had heard about him. He was even considered the greatest swordsman of East Blue. During that time, he met two bounty hunters, Johnny and Yosaku.\nBecause of his reputation as a bounty hunter, Zoro was offered a position as a numbered agent within Baroque Works. He replied that he would accept only if he became the leader of the organization, which they refused. He then killed Mr. 7, the agent who offered him the position, in self-defense.',
        'Zoro has devoted his life to becoming a powerful swordsman and fighter, and in his time as a bounty hunter and later the combatant of the Straw Hat Pirates, he has become extremely well-renowned for his exemplary abilities and accomplishments in battle.\nBy the time he met Luffy, Zoro had established himself as a fearsome bounty hunter in the East Blue, so much so that Koby had heard he was a "demon in the form of a man". His accomplishments in hunting pirates were significant enough to earn him the epithet of "Pirate Hunter", which he remains known by even after becoming a pirate. When Zoro dueled Dracule Mihawk, his former partners Johnny and Yosaku were completely confident that he would win due to Zoro''''s dominance over East Blue opponents, though they were ignorant to the fact that the East Blue is the weakest of the world''''s seas. Indeed, Zoro was utterly outclassed by Mihawk, a Warlord of the Sea from the Grand Line. Since that defeat, he promised to never lose a battle again.\nMultiple times, Zoro has been shown to have an animal-like spirit which occasionally manifests around him when he is readying an attack, including when he used No Sword Style.\nThis aura has not been indicated to be the result of any type of Haki; rather, it is mainly noted as a manifestation of Zoro''''s killing intent and tremendous power. Even Kaku, a CP9 agent with superhuman abilities, was able to greatly feel this spirit from Zoro. Notably during his duel with Ryuma, Zoro''''s finishing strike possessed the aura of a dragon, and after the cut was made the wound was set on fire; how this happened is uncertain.\nZoro typically does not plan out actions and strategies ahead of time, but he has shown himself to be extremely skilled at coming up with tactics in the middle of battle in order to gain an advantage over opponents or to take on an opponent who cannot be fought through conventional means. During his fight with the bounty hunters at Whisky Peak, Zoro utilized his environment to his advantage with tactics including using a large table as a shield as well as cutting a hole in the floor right at the spot where several hunters attempted to strike from above.\nHowever, given that Zoro still has a rash attitude in almost all situations, he has also heavily relied on and frequently benefited from luck and fortune. This was seen to its most extreme degree at Ipponmatsu''''s shop in Loguetown, where Zoro decided to test Sandai Kitetsu''''s "curse" on himself by throwing the blade up in a vertical spinning motion and holding his arm in the path of its descent. Miraculously, Sandai Kitetsu spun perfectly around his arm, missing it entirely; Ipponmatsu was left speechless at Zoro''''s incredible fortune.\nOne of Zoro''''s most prominent weaknesses is his utter inability to follow directions, resulting in him frequently getting lost. He only became a bounty hunter after leaving Shimotsuki Village because he lost his way while out at sea looking for Mihawk. He has no knowledge of how to identify cardinal directions, and frequently misinterprets them as either right or left; when traveling alone, he tends to frequently change direction without realizing and follow arbitrary indicators of direction like animals. In Arabasta, he even confused the cardinal directions with vertical ones, causing him to scale up Alubarna''''s clock tower when told to head north.'
       );

insert into master.category_image (code,"name")
values ('OPCI004','character-detail-zoro');

insert into master.image (series_id, category_id, code, filename) values
(_series_id, (select id from master.category_image where code = 'OPCI004'), 'zoro-gallery','zoro-gallery-01.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI004'), 'zoro-gallery','zoro-gallery-02.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI004'), 'zoro-gallery','zoro-gallery-03.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI004'), 'zoro-gallery','zoro-gallery-04.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI004'), 'zoro-gallery','zoro-gallery-05.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI004'), 'zoro-gallery','zoro-gallery-06.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI004'), 'zoro-gallery','zoro-gallery-07.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI004'), 'zoro-gallery','zoro-gallery-08.jpg'),
(_series_id, (select id from master.category_image where code = 'OPCI004'), 'zoro-gallery','zoro-gallery-09.jpg');

insert into master.character_gallery (character_detail_id, image_id)
select cd.id, i.id from master.character_detail cd, master.image i where cd.code = 'OPCD0002' and i.code = 'zoro-gallery';

insert into master.character_tag (character_detail_id,tag_id) values
((select id from master.character_detail where code = 'OPCD0002'), (select id from master.tag where code = 'OPTG034')),
((select id from master.character_detail where code = 'OPCD0002'), (select id from master.tag where code = 'OPTG056')),
((select id from master.character_detail where code = 'OPCD0002'), (select id from master.tag where code = 'OPTG051')),
((select id from master.character_detail where code = 'OPCD0002'), (select id from master.tag where code = 'OPTG060')),
((select id from master.character_detail where code = 'OPCD0002'), (select id from master.tag where code = 'OPTG052')),
((select id from master.character_detail where code = 'OPCD0002'), (select id from master.tag where code = 'OPTG009')),
((select id from master.character_detail where code = 'OPCD0002'), (select id from master.tag where code = 'OPTG045'));

insert into master.character_relationship (relationship_id,character_detail_id, character_id) values
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0002'),(select id from master.character where name like '%Luffy%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0002'),(select id from master.character where name like '%Sanji%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0002'),(select id from master.character where name like '%Nami%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0002'),(select id from master.character where name like '%Chopper%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0002'),(select id from master.character where name like '%Usopp%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0002'),(select id from master.character where name like '%Franky%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0002'),(select id from master.character where name like '%Robin%')),
((select id from master.relationship where code = 'OPRS01'),(select id from master.character_detail where code = 'OPCD0002'),(select id from master.character where name like '%Jinbe%')),
((select id from master.relationship where code = 'GERS04'),(select id from master.character_detail where code = 'OPCD0002'),(select id from master.character where name like '%Mihawk%'));

END $$;

insert  into publishing_house (adress,name) values ('Jodłowa 15, Warszawa','Dobra Książka')
insert  into publishing_house (adress,name) values ('Klonowa , Wrocław','Wydawnictwo Drugie Wydanie')
insert  into publishing_house (adress,name) values ('Jesionowa 112/23, Kraków','YAbooks')
insert  into publishing_house (adress,name) values ('Kwiatowa 111/20','Wydawnictwo zaksiażkowane')
insert  into publishing_house (adress,name) values ('Jesionowa 112/24, Kraków','FantasyBooks')
insert  into publishing_house (adress,name) values ('Sebastiana Kowalskiego 11/1, Łódź','Wydawnictwo Dwie Siostry')
insert  into publishing_house (adress,name) values ('Modrzewiowa 12/24, Łódź','FantasyBooks')
insert  into publishing_house (adress,name) values ('Sebastiana Kowalskiego 11/1, Łódź','Wydawnictwo Nowe')

insert into author (name) values ('Georg Orwell')

insert into author (name) values ('Harper Lee')

insert into author (name) values ('Francis Scott Fitzgerald')

insert into author (name) values ('Walt Disney')

insert into author (name) values ('Peter V. Brett')

insert into author (name) values ('Linda Geddes')



insert into book (title, genre, description, img,amount,publishing_house_id) values ('To Kill a Mockingbird','dramatic','The unforgettable novel of a childhood in a sleepy Southern town and the crisis of conscience that rocked it. "To Kill A Mockingbird" became both an instant bestseller and a critical success when it was first published in 1960.','https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1553383690l/2657.jpg',2,1)

insert into book (title, genre, description, img,amount,publishing_house_id) values ('1984','classics','Among the seminal texts of the 20th century, Nineteen Eighty-Four is a rare work that grows more haunting as its futuristic purgatory becomes more real.','https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1532714506l/40961427._SX318_.jpg',3,2)

insert into book (title, genre, description, img,amount,publishing_house_id) values ('The Great Gatsby','test','The Great Gatsby, F. Scott Fitzgerald''s third book, stands as the supreme achievement of his career.','https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1490528560l/4671._SY475_.jpg',1,1)

insert into book (title, genre, description, img,amount,publishing_house_id) values ('Winne The Pooh','pigletowo','Pooh and his friends enjoy a spirited game of hide-and-seek in the Hundred-Acre Wood.','https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1561740531l/2617684._SX318_.jpg',2,1)

insert into book (title, genre, description, img,amount,publishing_house_id) values ('Animal Farm','literatura piękna','A farm is taken over by its overworked, mistreated animals. With flaming idealism and stirring slogans, they set out to create a paradise of progress, justice, and equality.','https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1325861570l/170448.jpg',2,2)

insert into book (title, genre, description, img,amount,publishing_house_id) values ('Malowany Człowiek','fantasy','Zaszczuta i zdziesiątkowana ludzkość przeklina noc. Z każdym zmierzchem, w oparach mgły, nadchodzą opętane żądzą mordu bestie. Przerażeni ludzie chronią się za magicznymi runami. Usiłują wymodlić dla siebie i najbliższych kolejny dzień życia. Rzeź ustaje bladym świtem, gdy światło zapędza demony z powrotem w Otchłań.', 'https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1631005832l/58910483._SY475_.jpg',1,3)

insert into book (title, genre, description, img,amount,publishing_house_id) values ('W pogoni za słońcem','literatura popularnonaukowa','Naszą biologię zaprogramowało Słońce. Dostęp do jego światła stanowi kluczowy warunek szczęśliwego i satysfakcjonującego życia. To właśnie światło słoneczne wpływa na cykle snu i czuwania, układ odpornościowy i zdrowie psychiczne.','https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1561408924l/49523850._SX318_SY475_.jpg',3,7)


insert into book_author (book_id,author_id) values (2,1)
insert into book_author (book_id,author_id) values (1,2)
insert into book_author (book_id,author_id) values (3,3)
insert into book_author (book_id,author_id) values (4,4)
insert into book_author (book_id,author_id) values (5,1)

insert into book_author (book_id,author_id) values (6,6)
insert into book_author (book_id,author_id) values (7,5)

insert into user (email,name,password) values ('lukas.r200@gmail.com','Lukasz Romanowski','$2a$10$S6haaCfnUQdp2tpsBEUUReSZIIUViKjRK2rn8gFWUHdjvThaCM9hW')
insert into user (email,name,password) values ('karolina@gmail.com','Karolina Konduracka','$2a$10$S6haaCfnUQdp2tpsBEUUReSZIIUViKjRK2rn8gFWUHdjvThaCM9hW')
insert into user (email,name,password) values ('test@gmail.com','Jan Kowalski','$2a$10$S6haaCfnUQdp2tpsBEUUReSZIIUViKjRK2rn8gFWUHdjvThaCM9hW')
insert into user (email,name,password) values ('test2@gmail.com','Adam Nowak','$2a$10$S6haaCfnUQdp2tpsBEUUReSZIIUViKjRK2rn8gFWUHdjvThaCM9hW')
insert into user (email,name,password) values ('test3@gmail.com','Mateusz Kowalski','$2a$10$S6haaCfnUQdp2tpsBEUUReSZIIUViKjRK2rn8gFWUHdjvThaCM9hW')

insert into ratings (stars_count,book_book_id,user_id) values (3,1,2)
insert into ratings (stars_count,book_book_id,user_id) values (5,1,3)
insert into ratings (stars_count,book_book_id,user_id) values (4,1,4)
insert into ratings (stars_count,book_book_id,user_id) values (1,2,2)
insert into ratings (stars_count,book_book_id,user_id) values (2,2,3)
insert into ratings (stars_count,book_book_id,user_id) values (5,2,4)
insert into ratings (stars_count,book_book_id,user_id) values (1,3,2)
insert into ratings (stars_count,book_book_id,user_id) values (2,4,3)
insert into ratings (stars_count,book_book_id,user_id) values (5,5,4)
insert into ratings (stars_count,book_book_id,user_id) values (2,6,3)
insert into ratings (stars_count,book_book_id,user_id) values (5,7,4)

insert into borrowed_books (reservation_date,return_date,book_book_id,user_id) values ("2021-12-29","2022-01-05",1,1)
insert into borrowed_books (reservation_date,return_date,book_book_id,user_id) values ("2021-12-30","2021-01-06",2,1)

insert into comments (content,book_book_id,user_id) values ("Bardzo dobra książka",1,1)
insert into comments (content,book_book_id,user_id) values ("Test",1,2)
insert into comments (content,book_book_id,user_id) values ("Test2",1,3)

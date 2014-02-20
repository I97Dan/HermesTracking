insert into userapp values (userapp_seq.nextval, 'Adam', 'Turski');
insert into userapp values (userapp_seq.nextval, 'Ilona', 'Turska');
insert into userapp values (userapp_seq.nextval, 'Sylwester', 'Turski');
insert into userapp values (userapp_seq.nextval, 'Laura', 'Turska');

insert into userauthentication values (userauthentication_seq.nextval, 'adam', 'adam', 1);
insert into userauthentication values (userauthentication_seq.nextval, 'ilona', 'ilona', 2);
insert into userauthentication values (userauthentication_seq.nextval, 'sylwester', 'sylwester', 3);
insert into userauthentication values (userauthentication_seq.nextval, 'laura', 'laura', 4);

insert into userauthentication_roles values (1, 'USER');
insert into userauthentication_roles values (2, 'EMPLOYEE');
insert into userauthentication_roles values (3, 'MANAGER');
insert into userauthentication_roles values (4, 'ADMINISTRATOR');

insert into address values(address_seq.nextval,'Warszawa','PL','','12','32415','ul. Korotyńskiego');
insert into address values(address_seq.nextval,'Siedlce','PL','','78','52451','ul. 3-go Maja');
insert into address values(address_seq.nextval,'Kraków','PL','','54','11112','ul. Piłsudskiego');
insert into address values(address_seq.nextval,'Wrocław','PL','','21','11133','ul. Hynka');
insert into address values(address_seq.nextval,'Łódź','PL','','99','33222','ul. Puławska');
insert into address values(address_seq.nextval,'Gdańsk','PL','','2','12354','ul. Mikołaja Kopernika');
insert into address values(address_seq.nextval,'Płock','PL','','1','11554','Aleje Jerozolimskie');
insert into address values(address_seq.nextval,'Kołobrzeg','PL','','11','43526','ul. Łopuszańska');
insert into address values(address_seq.nextval,'Szczecin','PL','','65','67890','ul. Jutrzenki');
insert into address values(address_seq.nextval,'Zakopane','PL','','43','43212','ul. Łukowska');
insert into address values(address_seq.nextval,'Nasielsk','PL','9','21','02221','ul. Stefana Batorego');
insert into address values(address_seq.nextval,'Zalesie Górne','PL','12','21','12332','ul. Różana');
insert into address values(address_seq.nextval,'Lubartów','PL','13','99','12211','ul. Modzelewskiego');
insert into address values(address_seq.nextval,'Gdynia','PL','14','46','55433','ul. Jana III Sobieskiego');
insert into address values(address_seq.nextval,'Koło','PL','15','345','33221','ul. Czerwonego Krzyża');
insert into address values(address_seq.nextval,'Katowice','PL','54','6','12453','ul. Taśmowa');
insert into address values(address_seq.nextval,'Białystok','PL','2','43','32145','ul. Błonie');
insert into address values(address_seq.nextval,'Lublin','PL','','4','54321','ul. Staropijarska');
insert into address values(address_seq.nextval,'Otwock','PL','','123','12345','ul. Nowopijarska');
insert into address values(address_seq.nextval,'Józefów','PL','12','2','22334','ul. Kasztanowa');

insert into location values(location_seq.nextval,'Sortownia nr 1',1);
insert into location values(location_seq.nextval,'Sortownia 2',2);
insert into location values(location_seq.nextval,'Sortownia 3',3);
insert into location values(location_seq.nextval,'Sortownia 4',4);
insert into location values(location_seq.nextval,'Sortownia 5',5);
insert into location values(location_seq.nextval,'Urząd Pocztowy nr 1',6);
insert into location values(location_seq.nextval,'Urząd Pocztowy nr 2',7);
insert into location values(location_seq.nextval,'Urząd Pocztowy nr 3',8);
insert into location values(location_seq.nextval,'Urząd Pocztowy nr 4',9);
insert into location values(location_seq.nextval,'Urząd Pocztowy nr 5',10);

insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-01 11:02:44', 'YYYY-MM-DD HH24:MI:SS'),'Justyna Kowalska',11);
insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-02 12:10:55', 'YYYY-MM-DD HH24:MI:SS'),'ENIGMA SOI',12);
insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-03 13:03:57', 'YYYY-MM-DD HH24:MI:SS'),'Kwiaciarnia "Róża"',13);
insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-04 14:59:59', 'YYYY-MM-DD HH24:MI:SS'),'Bank BPH',14);
insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-05 15:21:01', 'YYYY-MM-DD HH24:MI:SS'),'Adam Gruszka',15);
insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-06 16:45:40', 'YYYY-MM-DD HH24:MI:SS'),'Krystyna Nowak',16);
insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-07 17:31:14', 'YYYY-MM-DD HH24:MI:SS'),'GULIK Hurtownia Spożywcza',17);
insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-08 18:14:04', 'YYYY-MM-DD HH24:MI:SS'),'Sklep odzieżowy "BUTIK"',18);
insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-09 19:21:21', 'YYYY-MM-DD HH24:MI:SS'),'Zakład fryzjerski GRZEBYK',19);
insert into shipment values(shipment_seq.nextval,TO_TIMESTAMP('2014-01-10 20:00:00', 'YYYY-MM-DD HH24:MI:SS'),'Anna Chacińska',20);

insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-01 11:02:44', 'YYYY-MM-DD HH24:MI:SS'),1,6,1);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-01 12:15:00', 'YYYY-MM-DD HH24:MI:SS'),0,6,1);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-01 14:01:44', 'YYYY-MM-DD HH24:MI:SS'),1,1,1);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-01 18:00:00', 'YYYY-MM-DD HH24:MI:SS'),0,1,1);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-01 20:22:44', 'YYYY-MM-DD HH24:MI:SS'),1,2,1);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-02 06:12:44', 'YYYY-MM-DD HH24:MI:SS'),0,2,1);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-02 07:32:44', 'YYYY-MM-DD HH24:MI:SS'),1,7,1);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-02 09:32:44', 'YYYY-MM-DD HH24:MI:SS'),0,7,1);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-02 11:00:44', 'YYYY-MM-DD HH24:MI:SS'),1,7,1);

insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-02 12:20:55', 'YYYY-MM-DD HH24:MI:SS'),1,7,2);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-02 16:15:00', 'YYYY-MM-DD HH24:MI:SS'),0,7,2);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-02 17:20:55', 'YYYY-MM-DD HH24:MI:SS'),1,2,2);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-02 18:25:05', 'YYYY-MM-DD HH24:MI:SS'),1,2,2);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-02 19:20:55', 'YYYY-MM-DD HH24:MI:SS'),1,8,2);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-03 08:15:00', 'YYYY-MM-DD HH24:MI:SS'),0,8,2);

insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-03 13:03:57', 'YYYY-MM-DD HH24:MI:SS'),1,8,3);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-03 16:15:00', 'YYYY-MM-DD HH24:MI:SS'),0,8,3);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-03 17:03:57', 'YYYY-MM-DD HH24:MI:SS'),1,3,3);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-03 19:03:57', 'YYYY-MM-DD HH24:MI:SS'),0,3,3);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-03 20:03:57', 'YYYY-MM-DD HH24:MI:SS'),1,9,3);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-04 09:03:57', 'YYYY-MM-DD HH24:MI:SS'),0,9,3);

insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-04 14:59:59', 'YYYY-MM-DD HH24:MI:SS'),1,9,4);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-04 16:15:00', 'YYYY-MM-DD HH24:MI:SS'),0,9,4);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-04 18:59:59', 'YYYY-MM-DD HH24:MI:SS'),1,4,4);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-04 19:59:59', 'YYYY-MM-DD HH24:MI:SS'),0,4,4);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-04 21:59:59', 'YYYY-MM-DD HH24:MI:SS'),1,1,4);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-05 06:59:59', 'YYYY-MM-DD HH24:MI:SS'),0,1,4);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-05 07:59:59', 'YYYY-MM-DD HH24:MI:SS'),1,10,4);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-05 10:59:59', 'YYYY-MM-DD HH24:MI:SS'),0,10,4);

insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-05 15:21:01', 'YYYY-MM-DD HH24:MI:SS'),1,10,5);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-05 16:15:00', 'YYYY-MM-DD HH24:MI:SS'),0,10,5);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-05 18:21:01', 'YYYY-MM-DD HH24:MI:SS'),1,5,5);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-05 19:21:01', 'YYYY-MM-DD HH24:MI:SS'),0,5,5);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-05 20:21:01', 'YYYY-MM-DD HH24:MI:SS'),1,1,5);
insert into shipmentmovement values(shipmentmovement_seq.nextval,TO_TIMESTAMP('2014-01-06 09:15:00', 'YYYY-MM-DD HH24:MI:SS'),0,1,5);

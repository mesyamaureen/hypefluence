-- public.kategorie definition

-- Drop table

-- DROP TABLE public.kategorie;

CREATE TABLE public.kategorie (
	id int4 NOT NULL,
	bezeichnung varchar NULL,
	CONSTRAINT kategorie_pk PRIMARY KEY (id)
);


-- public.benutzer definition

-- Drop table

-- DROP TABLE public.benutzer;

CREATE TABLE public.benutzer (
	id int4 NOT NULL,
	nachname varchar NULL,
	vorname varchar NULL,
	benutzername varchar NULL,
	passwort varchar NULL,
	email varchar NULL,
	profilbeschreibung varchar NULL,
	firmenname varchar NULL,
	ig_link varchar NOT NULL,
	fb_link varchar NOT NULL,
	yt_link varchar NOT NULL,
	tt_link varchar NOT NULL,
	tw_link varchar NOT NULL,
	kategorie_id int4 NOT NULL,
	CONSTRAINT benutzer_pk PRIMARY KEY (id),
	CONSTRAINT benutzer_kategorie_id_fkey FOREIGN KEY (kategorie_id) REFERENCES public.kategorie(id)
);


-- public.bewertung definition

-- Drop table

-- DROP TABLE public.bewertung;

CREATE TABLE public.bewertung (
	id int4 NOT NULL,
	bewertungspunkte int4 NULL,
	titel_der_bewertung varchar NULL,
	bewertungsbeschreibung varchar NULL,
	benutzer_id int4 NOT NULL,
	CONSTRAINT bewertung_pk PRIMARY KEY (id),
	CONSTRAINT bewertung_benutzer_id_fkey FOREIGN KEY (benutzer_id) REFERENCES public.benutzer(id)
);


-- public.influencer definition

-- Drop table

-- DROP TABLE public.influencer;

CREATE TABLE public.influencer (
	id int4 NOT NULL,
	benutzer_id int4 NOT NULL,
	CONSTRAINT influencer_pk PRIMARY KEY (id),
	CONSTRAINT influencer_benutzer_id_fkey FOREIGN KEY (benutzer_id) REFERENCES public.benutzer(id),
	CONSTRAINT influencer_benutzer_id_fkey1 FOREIGN KEY (benutzer_id) REFERENCES public.benutzer(id)
);


-- public.unternehmen definition

-- Drop table

-- DROP TABLE public.unternehmen;

CREATE TABLE public.unternehmen (
	id int4 NOT NULL,
	benutzer_id int4 NOT NULL,
	CONSTRAINT unternehmen_pk PRIMARY KEY (id),
	CONSTRAINT unternehmen_benutzer_id_fkey FOREIGN KEY (benutzer_id) REFERENCES public.benutzer(id)
);


-- public.jobanzeige definition

-- Drop table

-- DROP TABLE public.jobanzeige;

CREATE TABLE public.jobanzeige (
	id int4 NOT NULL,
	titel varchar NULL,
	beschreibung varchar NULL,
	preis float4 NULL,
	art_des_preises varchar NULL,
	zielgruppe varchar NULL,
	status varchar NULL,
	erstelldatum date NULL,
	unternehmen_id int4 NOT NULL,
	kategorie_id int4 NOT NULL,
	CONSTRAINT jobanzeige_pk PRIMARY KEY (id),
	CONSTRAINT jobanzeige_kategorie_id_fkey FOREIGN KEY (kategorie_id) REFERENCES public.kategorie(id),
	CONSTRAINT jobanzeige_unternehmen_id_fkey FOREIGN KEY (unternehmen_id) REFERENCES public.unternehmen(id)
);


-- public.bewerbung definition

-- Drop table

-- DROP TABLE public.bewerbung;

CREATE TABLE public.bewerbung (
	id int4 NOT NULL,
	subjekt varchar NULL,
	bewerbungsnachricht varchar NULL,
	erstelldatum date NULL,
	jobanzeige_id int4 NOT NULL,
	influencer_id int4 NOT NULL,
	CONSTRAINT bewerbung_pk PRIMARY KEY (id),
	CONSTRAINT bewerbung_influencer_id_fkey FOREIGN KEY (influencer_id) REFERENCES public.influencer(id),
	CONSTRAINT bewerbung_jobanzeige_id_fkey FOREIGN KEY (jobanzeige_id) REFERENCES public.jobanzeige(id)
);
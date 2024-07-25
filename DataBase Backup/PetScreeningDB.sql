--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3
-- Dumped by pg_dump version 16.3

-- Started on 2024-07-25 12:19:18

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4841 (class 0 OID 24578)
-- Dependencies: 215
-- Data for Name: breed; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.breed (id, name) FROM stdin;
1	poodle
2	bulldog
3	beagle
\.


--
-- TOC entry 4842 (class 0 OID 24583)
-- Dependencies: 216
-- Data for Name: pet; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pet (id, name, weight, vaccination_status, training_level, breed_id) FROM stdin;
3	laika	7	t	1	2
4	roco	10	t	6	3
1	kefka	15	f	2	1
2	lola	5	t	4	1
\.


--
-- TOC entry 4852 (class 0 OID 0)
-- Dependencies: 217
-- Name: Pet_ID_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Pet_ID_seq"', 2, true);


-- Completed on 2024-07-25 12:19:19

--
-- PostgreSQL database dump complete
--


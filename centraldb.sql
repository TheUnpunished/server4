--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.12
-- Dumped by pg_dump version 10.9 (Ubuntu 10.9-0ubuntu0.18.10.1)

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
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: contract; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contract (
    id bigint NOT NULL,
    demand_id bigint,
    offer_id bigint,
    nomenclature_id bigint,
    demandingorg_id bigint,
    offeringorg_id bigint,
    totalcount integer,
    totalprice double precision
);


ALTER TABLE public.contract OWNER TO postgres;

--
-- Name: contract_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.contract_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contract_seq OWNER TO postgres;

--
-- Name: demand; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.demand (
    id bigint NOT NULL,
    nomenclature_id bigint,
    count integer
);


ALTER TABLE public.demand OWNER TO postgres;

--
-- Name: demand_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.demand_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.demand_seq OWNER TO postgres;

--
-- Name: metric; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.metric (
    id bigint NOT NULL,
    code text,
    name text
);


ALTER TABLE public.metric OWNER TO postgres;

--
-- Name: metric_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.metric_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.metric_seq OWNER TO postgres;

--
-- Name: nomenclature; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.nomenclature (
    id bigint NOT NULL,
    uid uuid,
    productname text,
    createdate timestamp with time zone,
    modifydate timestamp with time zone,
    metric_id bigint,
    relevant boolean
);


ALTER TABLE public.nomenclature OWNER TO postgres;

--
-- Name: nomenclature_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.nomenclature_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.nomenclature_seq OWNER TO postgres;

--
-- Name: offer; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.offer (
    id bigint NOT NULL,
    nomenclature_id bigint,
    price double precision,
    count integer
);


ALTER TABLE public.offer OWNER TO postgres;

--
-- Name: offer_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.offer_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.offer_seq OWNER TO postgres;

--
-- Name: organisation_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.organisation_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.organisation_seq OWNER TO postgres;

--
-- Name: organization; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.organization (
    id bigint NOT NULL,
    name text
);


ALTER TABLE public.organization OWNER TO postgres;

--
-- Data for Name: contract; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.contract (id, demand_id, offer_id, nomenclature_id, demandingorg_id, offeringorg_id, totalcount, totalprice) FROM stdin;
\.


--
-- Data for Name: demand; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.demand (id, nomenclature_id, count) FROM stdin;
\.


--
-- Data for Name: metric; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.metric (id, code, name) FROM stdin;
\.


--
-- Data for Name: nomenclature; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.nomenclature (id, uid, productname, createdate, modifydate, metric_id, relevant) FROM stdin;
\.


--
-- Data for Name: offer; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.offer (id, nomenclature_id, price, count) FROM stdin;
\.


--
-- Data for Name: organization; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.organization (id, name) FROM stdin;
\.


--
-- Name: contract_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.contract_seq', 1, false);


--
-- Name: demand_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.demand_seq', 1, false);


--
-- Name: metric_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.metric_seq', 1, false);


--
-- Name: nomenclature_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.nomenclature_seq', 1, false);


--
-- Name: offer_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.offer_seq', 1, false);


--
-- Name: organisation_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.organisation_seq', 1, false);


--
-- Name: contract contract_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contract
    ADD CONSTRAINT contract_pkey PRIMARY KEY (id);


--
-- Name: demand demand_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.demand
    ADD CONSTRAINT demand_pkey PRIMARY KEY (id);


--
-- Name: metric metric_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.metric
    ADD CONSTRAINT metric_pkey PRIMARY KEY (id);


--
-- Name: nomenclature nomenclature_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.nomenclature
    ADD CONSTRAINT nomenclature_pkey PRIMARY KEY (id);


--
-- Name: offer offer_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.offer
    ADD CONSTRAINT offer_pkey PRIMARY KEY (id);


--
-- Name: organization organization_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.organization
    ADD CONSTRAINT organization_pkey PRIMARY KEY (id);


--
-- Name: contract fk_contract_demand; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contract
    ADD CONSTRAINT fk_contract_demand FOREIGN KEY (demand_id) REFERENCES public.demand(id);


--
-- Name: contract fk_contract_nomenclature; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contract
    ADD CONSTRAINT fk_contract_nomenclature FOREIGN KEY (nomenclature_id) REFERENCES public.nomenclature(id);


--
-- Name: contract fk_contract_offer; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contract
    ADD CONSTRAINT fk_contract_offer FOREIGN KEY (offer_id) REFERENCES public.offer(id);


--
-- Name: contract fk_contract_organization_demanding; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contract
    ADD CONSTRAINT fk_contract_organization_demanding FOREIGN KEY (demandingorg_id) REFERENCES public.organization(id);


--
-- Name: contract fk_contract_organization_offering; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contract
    ADD CONSTRAINT fk_contract_organization_offering FOREIGN KEY (offeringorg_id) REFERENCES public.organization(id);


--
-- Name: demand fk_demand_nomenclature; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.demand
    ADD CONSTRAINT fk_demand_nomenclature FOREIGN KEY (nomenclature_id) REFERENCES public.nomenclature(id);


--
-- Name: nomenclature fk_nomenclature_metric; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.nomenclature
    ADD CONSTRAINT fk_nomenclature_metric FOREIGN KEY (metric_id) REFERENCES public.metric(id);


--
-- Name: offer fk_offer_nomenclature; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.offer
    ADD CONSTRAINT fk_offer_nomenclature FOREIGN KEY (nomenclature_id) REFERENCES public.nomenclature(id);


--
-- PostgreSQL database dump complete
--


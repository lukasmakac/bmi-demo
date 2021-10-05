#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
  CREATE USER "bmi" PASSWORD 'bmi';
	CREATE DATABASE "bmi-demo";

	GRANT ALL PRIVILEGES ON DATABASE "bmi-demo" TO "bmi";
EOSQL
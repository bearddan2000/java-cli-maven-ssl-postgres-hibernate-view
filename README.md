# java-cli-maven-ssl-postgres-hibernate-view

## Description
Creates a small database table
called `dog` and populates with
hql. Creates 2 lookup tables `breedLookup`
and `colorLookup` and 4N `dog`.

Joins `breedLookup` and `colorLookup`
to form a new table `dogextended`. These
views are deministrated 3 ways, `ResultTransformer`,
looking up ids on `breedLookup` and `colorLookup`,
and non-ResultTransformer method.

Add an immutable entity `breedcount` as a view uses a subquery join.

Uses self-sign ssl.

## Tech stack
- java
- maven
  - hibernate
  - hql
  - log4j
  - postgres driver

## Docker stack
- alpine:edge
- maven:3-openjdk-17
- postgres:alpine

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [HQL code based on](https://www.journaldev.com/2954/hibernate-query-language-hql-example-tutorial)
- [Hibernate config based on](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/An-example-hibernatecfgxml-for-postgres-8-and-Hibernate-5)
- [Hibernate code based on](https://github.com/lokeshgupta1981/hibernate/tree/master/hibernate-hello-world)

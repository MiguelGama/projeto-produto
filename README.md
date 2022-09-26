# projeto-produto
Spring boot produto
## Deploy

Necessário Subir um banco Postgress. Segestão: Instalar Docker e executar

```bash
  docker run --name postgresql-container -p 5432:5432 -e POSTGRES_PASSWORD=somePassword -d postgres
```

## Run

Ao executar o Projeto, subir com a properties perfil local

```bash
  spring.profiles.active=local
```
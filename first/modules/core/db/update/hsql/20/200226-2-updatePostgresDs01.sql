alter table FIRST_POSTGRES_DS add constraint FK_FIRST_POSTGRES_DS_ON_FACADE_LAYER foreign key (FACADE_LAYER_ID) references FIRST_FACADE_LAYER(ID);
create index IDX_FIRST_POSTGRES_DS_ON_FACADE_LAYER on FIRST_POSTGRES_DS (FACADE_LAYER_ID);

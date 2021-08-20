package com.dio.live.model;

//some lombok imports could be replaced for @Data. See: 'https://projectlombok.org/features/Data'
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
  Class 'JornadaTrabalho': Database entity.
  Annotations:
  lombok:
    - @Getter, @Setter: generate implementations of the getters(Object other)
    and setter() methods.
    - @AllArgsConstructor, @NoArgsConstructor: Generates an all-args constructor
    and a no-args constructor.
    - @EqualsAndHashCode: generate implementations of the equals(Object other)
    and hashCode() methods.
    - @Builder: lets you automatically produce the code required to
    have your class be instantiable with code such as:
        Person.builder().name("Adam Savage").city("San Francisco")
        .job("Mythbusters").job("Unchained Reaction").build();
  javax:
    - @Entity: Data persistence. Specifies that the class is an entity.
    - @id: Specifies the primary key of an entity.
    - @GeneratedValue: Provides for the specification of generation strategies
    for the values of primary keys.
  hibernate:
    - @Audited: For each audited entity, a table will be created,
    which will hold the history of changes made to that entity.
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}

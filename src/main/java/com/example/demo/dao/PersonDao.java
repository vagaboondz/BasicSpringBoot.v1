package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
//ამ კლასში გვაქვს ორი მეთოდი
//პირველი საშუალებას გვაძლევს მომხმარებელს ხელით მივანიჭოთ იდ
public interface PersonDao {
    int insertPerson(UUID id, Person person);
//ეს მეთოდი გვაძლევს საშუალებას  მომხმარებელს ავტომატურად მივანიჭოთ დაგენერირებული იდ
default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    //მეთოდების გამოცხადება
    Optional<Person> selectPersonById(UUID uuid);

    //Segvedzleba wavshemot momxmarebeli id sashaualebtit
    int deletePersonById(UUID id);

    //shegvedzleba shevcvalot momxmarebeli id saSualebit da mivanichot axali saxeli
    int updatePersonByID(UUID id, Person person);
}

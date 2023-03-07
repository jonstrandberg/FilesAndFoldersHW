package com.codeclan.example.FilesAndFolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persons")
public class Person {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "name")
        private String name;
        @OneToMany(mappedBy = "person")
        @JsonIgnoreProperties("person")
        private List<Folder> folder;


        public Person(String name) {
            this.name = name;
        }

        public Person(){};

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Folder> getFolder() {
            return folder;
        }

        public void setFolder(List<Folder> folder) {
            this.folder = folder;
        }

        public Long getId() {
        return id;
        }

        public void setId(Long id) {
        this.id = id;
        }
}



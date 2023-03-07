package com.codeclan.example.FilesAndFolders.components;

import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.Person;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    PersonRepository personRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {


        Folder bigAssFolder = new Folder("Big Ass Folder");
        folderRepository.save(bigAssFolder);

        Person bob = new Person("Bob");
        personRepository.save(bob);

        File bigNotes = new File("Big Ol Notes", "txt", 56, bigAssFolder);
        fileRepository.save(bigNotes);
        File marketingStrategy  = new File("Marketing Strategy", "pdf", 246, bigAssFolder);
        fileRepository.save(marketingStrategy);





    }

}

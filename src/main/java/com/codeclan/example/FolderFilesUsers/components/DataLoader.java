package com.codeclan.example.FolderFilesUsers.components;

import com.codeclan.example.FolderFilesUsers.models.File;
import com.codeclan.example.FolderFilesUsers.models.Folder;
import com.codeclan.example.FolderFilesUsers.models.User;
import com.codeclan.example.FolderFilesUsers.repositories.FileRepository;
import com.codeclan.example.FolderFilesUsers.repositories.FolderRepository;
import com.codeclan.example.FolderFilesUsers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user1 = new User("Jacky");
        userRepository.save(user1);
        User user2 = new User("Kelso");
        userRepository.save(user2);
        User user3 = new User("Eric");
        userRepository.save(user3);
        User user4 = new User("Donna");
        userRepository.save(user4);

        Folder letters = new Folder("Letters", user1);
        folderRepository.save(letters);
        Folder numbers = new Folder("Numbers", user1);
        folderRepository.save(numbers);
        Folder colours = new Folder("Colours", user3);
        folderRepository.save(colours);
        Folder animals = new Folder("Animals", user4);
        folderRepository.save(animals);
        Folder fruits = new Folder("Fruits", user2);
        folderRepository.save(fruits);

        File A = new File("A", ".java", 58.0, letters);
        fileRepository.save(A);
          File B = new File("B", ".java", 48.0, letters);
        fileRepository.save(B);
          File C = new File("C", ".java", 38.0, letters);
        fileRepository.save(C);
          File one = new File("One", ".py", 28.0, numbers);
        fileRepository.save(one);
          File two = new File("Two", ".py", 68.0, numbers);
        fileRepository.save(two);
          File three = new File("Three", ".py", 58.0, numbers);
        fileRepository.save(three);
          File green = new File("Green", ".js", 48.0, colours);
        fileRepository.save(green);
          File yellow = new File("Yellow", ".js", 90.0, colours);
        fileRepository.save(yellow);
          File lightBlue = new File("Light Blue", ".js", 65.0, colours);
        fileRepository.save(lightBlue);
          File dog = new File("Dog", ".ppt", 39.0, animals);
        fileRepository.save(dog);
         File sloth = new File("Sloth", ".ppt", 87.0, animals);
        fileRepository.save(sloth);
         File pineapple = new File("Pineapple", ".doc", 52.0, fruits);
        fileRepository.save(pineapple);
         File pomegranate = new File("Pomegranate", ".doc", 34.0, fruits);
        fileRepository.save(pomegranate);

    }


}

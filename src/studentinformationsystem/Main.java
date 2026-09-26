package studentinformationsystem;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Main {

    public static void main(String[] args) {
        
       ArrayList<Student> students = new ArrayList<>();
       
       Faculty faculty = new Faculty(
        "FAC-001",
        "ENG",
        "Faculty of Engineering",
        null,
        "5551234567",
        "engineering@university.edu",
        true,
        OffsetDateTime.now()
);
       Department department = new Department(
        "DEP-001",
        "CSE",
        "Computer Engineering",
        faculty,
        null,
        "5559876543",
        "cse@university.edu",
        true
);
       Program program = new Program(
        "PROG-001",
        "CENG",
        "Computer Engineering",
        department,
        DegreeLevel.LISANS,
        240,
        4,
        "EN",
        true
);
       Student student = new Student(
        "STD-001",
       "202600001",
        "12345678901",
       "John",
        "Doe",
        LocalDate.of(2004, 5, 12),
        Gender.MALE,
        "abdalla@example.com",
        "5551112233",
        "Istanbul",
        program,
        2023,
        3,
        StudentStatus.ACTIVE,
        "photo.jpg",
        OffsetDateTime.now()
);
       students.add(student);
       System.out.println("Registered Students:");
for (Student s : students) {
    System.out.println(s);
}
    }
    
}

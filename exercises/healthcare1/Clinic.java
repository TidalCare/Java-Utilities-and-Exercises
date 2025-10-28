package exercises.healthcare1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Clinic {

   private static final Random rand = new Random();

   private static final String[] PATIENT_FIRST_NAMES = {
      "John",
      "Jane",
      "Robert",
      "Emily",
      "Michael",
      "Sarah",
      "David",
      "Laura",
      "James",
      "Olivia",
      "William",
      "Sophia",
      "Daniel",
      "Mia",
      "Chris",
      "Charlotte"
   };
   private static final String[] PATIENT_LAST_NAMES = {
      "Smith",
      "Doe",
      "Johnson",
      "Williams",
      "Brown",
      "Jones",
      "Garcia",
      "Miller",
      "Davis",
      "Lee",
      "Walker",
      "Hall",
      "Allen",
      "Young",
      "Hernandez",
      "King"
   };
   private static final String[] GENDERS = {
      "Male",
      "Female",
      "Non-binary"
   };

   private static final String[] DOC_FIRST_NAMES = {
      "Dr. Alice",
      "Dr. Peter",
      "Dr. Susan",
      "Dr. Mark",
      "Dr. Helen",
      "Dr. Tom",
      "Dr. Priya",
      "Dr. Ben"
   };
   private static final String[] DOC_LAST_NAMES = {
      "Wong",
      "Chen",
      "Patel",
      "Nguyen",
      "Kim",
      "Singh",
      "Walker",
      "Scott"
   };
   private static final String[] SPECIALTIES = {
      "Cardiology",
      "Pediatrics",
      "Neurology",
      "Dermatology",
      "Oncology",
      "Radiology",
      "General Practice"
   };

   public static record Patient(
      String id,
      String firstName,
      String lastName,
      LocalDate dateOfBirth,
      String gender
   ) {}

   public static record Doctor(
      String id,
      String firstName,
      String lastName,
      String specialty
   ) {}

   public static void main(String[] args) {

      int numPatientsToGenerate = 10;
      int numDoctorsToGenerate = 3;

      List < Patient > patients = new ArrayList < > ();
      List < Doctor > doctors = new ArrayList < > ();

      System.out.println(">>> Generating Clinic Records...");

      for (int i = 0; i < numDoctorsToGenerate; i++) {
         doctors.add(generateRandomDoctor(i + 1));
      }

      for (int i = 0; i < numPatientsToGenerate; i++) {
         patients.add(generateRandomPatient(i + 1));
      }

      System.out.println("\n>>> Clinic Doctors (" + doctors.size() + "):");
      for (Doctor doc: doctors) {
         System.out.println(doc);
      }

      System.out.println("\n>>> Clinic Patients (" + patients.size() + "):");
      for (Patient p: patients) {
         System.out.println(p);
      }
   }

   public static Patient generateRandomPatient(int idNumber) {
      String id = String.format("P%03d", idNumber);
      String fName = PATIENT_FIRST_NAMES[rand.nextInt(PATIENT_FIRST_NAMES.length)];
      String lName = PATIENT_LAST_NAMES[rand.nextInt(PATIENT_LAST_NAMES.length)];
      String gender = GENDERS[rand.nextInt(GENDERS.length)];

      int year = rand.nextInt(61) + 1950;
      int month = rand.nextInt(12) + 1;
      int day = rand.nextInt(28) + 1;
      LocalDate dob = LocalDate.of(year, month, day);

      return new Patient(id, fName, lName, dob, gender);
   }

   public static Doctor generateRandomDoctor(int idNumber) {
      String id = String.format("D%03d", idNumber);
      String fName = DOC_FIRST_NAMES[rand.nextInt(DOC_FIRST_NAMES.length)];
      String lName = DOC_LAST_NAMES[rand.nextInt(DOC_LAST_NAMES.length)];
      String specialty = SPECIALTIES[rand.nextInt(SPECIALTIES.length)];

      return new Doctor(id, fName, lName, specialty);
   }
}
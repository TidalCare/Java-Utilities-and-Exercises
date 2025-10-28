package exercises.healthcare1;

import java.time.LocalDate;

public class Patient {

   // Private Stuffs
   //--------------------------------------------

   private String patientId;
   private String firstName;
   private String lastName;
   private String gender;
   private LocalDate dateOfBirth;

   // Public Stuffs
   //--------------------------------------------

   public Patient(String patientId, String firstName, String lastName, LocalDate dateOfBirth, String gender) {
      this.setPatientId(patientId);
      this.setFirstName(firstName);
      this.setLastName(lastName);
      this.setDateOfBirth(dateOfBirth);
      this.setGender(gender);
   }

   // --- Public Getter Methods ---
   public String getPatientId() {
      return patientId;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getGender() {
      return gender;
   }

   public LocalDate getDateOfBirth() {
      return dateOfBirth;
   }

   // --- Public Setter Methods ---

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setPatientId(String patientId) {
      this.patientId = patientId;
   }
   public void setDateOfBirth(LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }
   public void setGender(String gender) {
      this.gender = gender;
   }

}
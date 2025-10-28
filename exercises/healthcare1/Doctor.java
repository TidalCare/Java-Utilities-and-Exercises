package exercises.healthcare1;

/**
 * Represents a Doctor in the healthcare system.
 */
public class Doctor {

   // Private Stuffs
   //--------------------------------------------
   private String doctorId;
   private String firstName;
   private String lastName;
   private String specialty;

   // Public Stuffs
   //--------------------------------------------

   public Doctor(String doctorId, String firstName, String lastName, String specialty) {
      this.doctorId = doctorId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.specialty = specialty;
   }

   public String getDoctorId() {
      return doctorId;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getSpecialty() {
      return specialty;
   }

}
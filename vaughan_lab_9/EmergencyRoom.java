import java.util.PriorityQueue;
import java.util.Comparator;
import java.time.LocalTime;

public class EmergencyRoom {
    private final PriorityQueue<Patient> patientQueue;

    public EmergencyRoom(Comparator<Patient> comparator) {
        this.patientQueue = new PriorityQueue<>(comparator);
    }

    public void checkIn(Patient patient, Severity severity) {
        patient.setSeverity(severity.ordinal() + 1);
        patient.setArrivalTime(LocalTime.now());
        patientQueue.add(patient);
    }

    public Patient admit() {
        return patientQueue.poll();
    }

    // Add a getter for patientQueue
    public PriorityQueue<Patient> getPatientQueue() {
        return patientQueue;
    }
}


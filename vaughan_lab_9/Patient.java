import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;

class Patient {
    private final String name;
    private final LocalDate dob;
    private int severity;
    private LocalTime arrivalTime;

    public Patient(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Name=" + name + "\nDOB=" + dob + "\nseverity=" + severity + "\narrivalTime=" + arrivalTime;
    }
}
class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        if (p1.getSeverity() != p2.getSeverity()) {
            return p2.getSeverity() - p1.getSeverity(); // Higher severity gets priority
        } else if (!p1.getDob().equals(p2.getDob())) {
            return p1.getDob().compareTo(p2.getDob()); // Older patients get priority
        } else {
            return p1.getArrivalTime().compareTo(p2.getArrivalTime()); // Earlier arrival time gets priority
        }
    }
}

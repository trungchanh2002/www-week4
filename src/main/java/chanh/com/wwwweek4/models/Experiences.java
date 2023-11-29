package chanh.com.wwwweek4.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "experiences")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Experiences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate toDate;
    private LocalDate fromDate;
    private String companyName;
    private String role;
    private String workDescription;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Candidate candidate;

    public Experiences(LocalDate toDate, LocalDate fromDate, String companyName, String role, String workDescription, Candidate candidate) {
        this.toDate = toDate;
        this.fromDate = fromDate;
        this.companyName = companyName;
        this.role = role;
        this.workDescription = workDescription;
        this.candidate = candidate;
    }

}

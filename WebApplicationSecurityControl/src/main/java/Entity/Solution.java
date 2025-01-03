package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Solution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Lob
    private String description;
    @Enumerated(EnumType.STRING)
    private TypesOfSolutions typeOfSolution;
    private String link;
    @ManyToOne
    @JoinColumn(name = "vulnerability_id")
    private Vulnerability vulnerability;

    public enum TypesOfSolutions{
        PATCH,
        WORKAROUND,
        CONFIGURATIONS_UPDATE
    }
}

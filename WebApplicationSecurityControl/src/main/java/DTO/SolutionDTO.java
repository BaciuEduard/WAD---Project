package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SolutionDTO {
    private int id;
    private String name;
    private String description;
    private VulnerabilityDTO vulnerabilityDTO;
    private String typeOfSolution;
    private String link;
}

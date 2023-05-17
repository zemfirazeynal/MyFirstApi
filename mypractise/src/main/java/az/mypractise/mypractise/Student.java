package az.mypractise.mypractise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long studentID;
    private String Surname;
    private String Faculty;
}

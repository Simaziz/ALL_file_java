
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Email{
    private String uuid;
    private String topic;
    private String description;
    private LocalDate sentDate;
}
public class PolyGetSet {
    public static void main(String[] args) {
        Email email = Email.builder()
                .uuid(UUID.randomUUID().toString())
                .topic("Topic"+" ")
                .description("Description"+" ")
                .sentDate(LocalDate.now())
                .build();
        System.out.println(email);
    }
}
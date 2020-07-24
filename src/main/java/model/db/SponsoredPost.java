package model.db;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Arrays;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class SponsoredPost extends Post {

    private User sponsor;

    @Override
    public List<User> getLikeNotificationRecipients() {
        return Arrays.asList(getAuthor(), sponsor);
    }
}

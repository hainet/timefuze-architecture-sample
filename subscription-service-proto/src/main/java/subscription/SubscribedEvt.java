package subscription;

import lombok.Value;

@Value
public class SubscribedEvt {

    private final String id;

    private final String user;

    private final String plan;
}
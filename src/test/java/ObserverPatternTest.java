import static org.junit.Assert.assertEquals;

import com.observer.model.Observer;
import com.observer.model.UpdateObserver;
import com.observer.model.UpdateCase;
import org.junit.Test;

public class ObserverPatternTest {

    @Test
    public void testObserverPattern() throws CloneNotSupportedException {

        UpdateCase event = new UpdateCase();

        Observer observer = new UpdateObserver(event);
        event.attach(observer);
        event.setState(1);

        assertEquals(1, ((UpdateObserver) observer).getObserverState());

        event.dettach(observer);
        event.setState(0);

        assertEquals(1, ((UpdateObserver) observer).getObserverState());
    }
}

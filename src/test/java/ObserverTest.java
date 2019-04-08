import static org.junit.Assert.assertEquals;

import com.observer.model.Observer;
import com.observer.model.UpdateObserver;
import com.observer.model.UpdateSubject;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void testObserver() throws CloneNotSupportedException {

        UpdateSubject subject = new UpdateSubject();

        Observer observer = new UpdateObserver(subject);
        subject.attach(observer);
        subject.setState(1);

        assertEquals(1, ((UpdateObserver) observer).getObserverState());

        subject.dettach(observer);
        subject.setState(0);

        assertEquals(1, ((UpdateObserver) observer).getObserverState());
    }
}

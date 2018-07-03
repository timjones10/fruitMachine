import org.junit.Test;
import org.mockito.Mock;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class MachineTest {

    @Mock
    Machine machineMock;

        @Test
        public void spinReturnsArraylistOfFourStrings(){

            ArrayList<String> results = new ArrayList<>();
            results.add("black");
            results.add("white");
            results.add("green");
            results.add("yellow");
            when(machineMock.spin()).thenReturn(results);
           assertThat(machineMock.spin(), equalTo(results));
        }

    }
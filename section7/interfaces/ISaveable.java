package section7.interfaces;

import java.util.List;

public interface ISaveable {

    List<String> write();

    void read(List<String> list);
}

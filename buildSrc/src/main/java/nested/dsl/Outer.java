package nested.dsl;

import org.gradle.api.Action;

public class Outer {
    private Inner inner = new Inner();
    
    public void inner(Action<? super Inner> action) {
        action.execute(inner);
    }

}

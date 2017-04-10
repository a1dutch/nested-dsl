package nested.dsl;

import org.gradle.api.Action;

public class Outist {
    private Outer outer = new Outer();
    
    public void outer(Action<? super Outer> action) {
        action.execute(outer);
    }
}

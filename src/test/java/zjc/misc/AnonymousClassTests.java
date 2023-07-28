package zjc.misc;

import org.junit.jupiter.api.Test;

public class AnonymousClassTests {
    AnonymousClass anonymousClass = new AnonymousClass();

    @Test
    public void anonymousClassThatExtendsClass() {
        anonymousClass.anonymousClassThatExtendsClass();
    }

    @Test
    public void anonymousClassThatImplementsInterface() {
        anonymousClass.anonymousClassThatImplementsInterface();
    }

    @Test
    public void anonymousClassAsArgumentOfMethodOrConstructor() {
        anonymousClass.anonymousClassAsArgumentOfMethodOrConstructor();
    }
}

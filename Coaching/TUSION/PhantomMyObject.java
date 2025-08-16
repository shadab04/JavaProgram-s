package TUSION;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomMyObject {
    @Override
    public String toString() {
        return "This is PhantomMyObject";
    }
}

class Demo {
    public static void main(String[] args) {
        PhantomMyObject p = new PhantomMyObject();
        System.out.println("Before nulling: " + p);

        // Declare ReferenceQueue with type
        ReferenceQueue<PhantomMyObject> refq = new ReferenceQueue<>();

        // Declare PhantomReference with type
        PhantomReference<PhantomMyObject> phantomRef = new PhantomReference<>(p, refq);

        // Remove strong reference
        p = null;
        System.out.println("After nulling: " + p);

        // This will always return null for PhantomReference
        PhantomMyObject objFromRef = phantomRef.get();
        System.out.println("phantomRef.get(): " + objFromRef);
    }
}
